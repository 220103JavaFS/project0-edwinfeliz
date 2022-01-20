package Revature.Project0;
import Revature.Project0.controllers.Controller;
import Revature.Project0.controllers.LoginController;
import Revature.Project0.controllers.UserController;
import io.javalin.Javalin;

public class App {
    private static Javalin app;

    public static void main(String[] args) {
        app = Javalin.create();
        configure(new UserController(), new LoginController());
        app.start();
    }
    private static void configure(Controller... controllers){
        for (Controller c:controllers){
            c.addRoutes(app);
        }
    }

}
