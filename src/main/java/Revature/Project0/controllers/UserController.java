package Revature.Project0.controllers;

import Revature.Project0.models.User;
import Revature.Project0.services.LoginService;
import Revature.Project0.services.UserService;
import io.javalin.Javalin;
import io.javalin.http.Handler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserController implements Controller{

    private UserService userService = new UserService();
    private static Logger log = LoggerFactory.getLogger(LoginService.class);


    Handler getUsers = (ctx) ->{
        if (ctx.req.getSession(false)!=null) { //get-session false will only return a session object if  the client sent
            //a cookie along with the request that matches an open session.
            int access_level =  ctx.sessionAttribute("access_level");
            if (access_level<3) {
                ctx.json(userService.findAllUsers());
                ctx.status(200);
            }else{
                ctx.status(401);
            }
        }else{
            ctx.status(401);
        }
    };

    Handler getUser=(ctx)-> {
        if (ctx.req.getSession(false)!=null){
            String userEmail = ctx.pathParam("userEmail");
            User user = userService.findEmail(userEmail);
            ctx.json(user);
            ctx.status(200);
        }else{
            ctx.status(401);
        }
    };

    Handler deleteUser=(ctx)-> {
        if (ctx.req.getSession(false)!=null){
            String userEmail = ctx.pathParam("userEmail");
            ctx.json(userService.deleteUser(userEmail));
            ctx.status(200);
        }else{
            ctx.status(401);
        }
    };

    Handler updateUser=(ctx)-> {
        if (ctx.req.getSession(false)!=null){
            User user = ctx.bodyAsClass(User.class);
            if (userService.updateUser(user)){
                ctx.status(202);
            }else{
                ctx.status(400);
            }
        }else{
            ctx.status(401);
        }
    };

    Handler newUser =(ctx)-> {
        if (ctx.req.getSession(false)!=null){
            User user = ctx.bodyAsClass(User.class);
            if (userService.addUser(user)){
                ctx.status(202);
            }else{
                ctx.status(202);
            }
        }else{
            ctx.status(401);
        }
    };


    @Override
    public void addRoutes(Javalin app) {
        app.get("/user",getUsers);
        app.get("/user/{userEmail}",getUser);
        app.put("/user/{userEmail}",deleteUser);
        app.put("/user",updateUser);
        app.post("/user",newUser);
    }
}
