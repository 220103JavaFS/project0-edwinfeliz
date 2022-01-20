package Revature.Project0.controllers;

import Revature.Project0.services.TransactionService;
import Revature.Project0.services.LoginService;
import io.javalin.Javalin;
import io.javalin.http.Handler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TransactionController implements Controller{

    private TransactionService transactionService = new TransactionService();
    private static Logger log = LoggerFactory.getLogger(LoginService.class);

    Handler getTransactions = (ctx) -> {
        if (ctx.req.getSession(false)!=null){
            int access_level =  ctx.sessionAttribute("access_level");
            if (access_level<2) {
                ctx.json(transactionService.findAllTransactions());
                ctx.status(200);
            }else{
                ctx.status(401);
            }
        }else{
            ctx.status(401);
        }
        };

    @Override
    public void addRoutes(Javalin app) {
        app.get("/transactions",getTransactions);
    }
}
