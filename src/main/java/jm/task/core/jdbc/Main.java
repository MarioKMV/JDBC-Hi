package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        // реализуйте алгоритм здесь
//        Class<Driver> driverClass = Driver.class;
        UserService userService = new UserServiceImpl ();
//        String sql = """
// CREATE TABLE user;
//""";
        userService.createUsersTable();
        userService.saveUser("Ivan", "Ivanov", (byte) 5);
//        System.out.println("User c имненем '" + userService.getAllUsers().get(0).getName() + "' добавлен в базу данных");
        userService.saveUser("Petr", "Petrov", (byte) 22);
        userService.saveUser("Svetlana", "Svetikova", (byte) 12);
        userService.saveUser("Olga", "Avdeeva", (byte) 25);
        userService.getAllUsers ();

        userService.cleanUsersTable();
        userService.dropUsersTable();




    }
}
