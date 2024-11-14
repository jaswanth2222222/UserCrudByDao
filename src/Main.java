import java.sql.*;

public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoImpl();

        User newUser = new User(0, "Jaswanth", "jaswanth@gmail.com");
        userDao.saveUser(newUser);
        System.out.println("User saved successfully.");

        User retrievedUser = userDao.getUserById(1);
        if (retrievedUser != null) {
            System.out.println("Retrieved User: " + retrievedUser.getName());
        } else {
            System.out.println("User not found.");
        }

        if (retrievedUser != null) {
            retrievedUser.setEmail("jaswanth@yahoo.com");
            userDao.updateUser(retrievedUser);
            System.out.println("User updated successfully.");
        }

    }
}