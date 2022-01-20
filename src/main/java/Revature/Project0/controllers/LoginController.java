package Revature.Project0.controllers;

import Revature.Project0.models.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import Revature.Project0.services.LoginService;
import io.javalin.Javalin;
import io.javalin.http.Handler;

public class LoginController implements Controller{

    LoginService loginService = new LoginService();
    private static Logger log = LoggerFactory.getLogger(LoginService.class);


    private Handler loginAttempt = (ctx) ->{
        UserDTO user = ctx.bodyAsClass(UserDTO.class); //A DTO (Data transfer object) is a temporary object used

        int level = loginService.login(user.username, user.password);

        if(level>0){
            ctx.req.getSession(); //This will return an httpSession object.  If none exists then a new one will be created
            //and a cookie will be added to the response for the client to store
            ctx.sessionAttribute("access_level",level);
            ctx.status(200);
        }else{
            ctx.req.getSession().invalidate();//invalidates any open session that is attached to the client that sent invalid credentials
            ctx.status(401);
        }
    };

    @Override
    public void addRoutes(Javalin app) {
        app.post("/login",this.loginAttempt);
    }
}
