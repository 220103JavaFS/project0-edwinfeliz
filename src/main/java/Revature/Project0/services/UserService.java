package Revature.Project0.services;

import Revature.Project0.models.User;
import Revature.Project0.repos.UserDAO;
import Revature.Project0.repos.UserDAOImpl;
import java.util.List;

public class UserService {
    private UserDAO userDAO = new UserDAOImpl();

    public List<User> findAllUsers() {
        return userDAO.findAll();
    }

    public User findEmail(String email){
        return userDAO.findByEmail(email);
    }

    public boolean updateUser(User user){
        return userDAO.updateUser(user);
    }

    public boolean addUser(User user){
        return userDAO.addUser(user);
    }

    public boolean deleteUser(String email){
        return userDAO.deleteUser(email);
    }

}
