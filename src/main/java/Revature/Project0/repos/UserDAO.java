package Revature.Project0.repos;
import Revature.Project0.models.User;
import java.util.List;

public interface UserDAO {
    public List<User> findAll();
    public User findByEmail(String email);
    public boolean updateUser(User user);
    public boolean addUser(User user);
    public boolean deleteUser(String email);
}
