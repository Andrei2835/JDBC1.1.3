package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {


    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        List<User> list;


        userService.createUsersTable();

        userService.saveUser("Ivan", "Ivanov", (byte) 40);
        userService.saveUser("Sergey", "Kolesnikov", (byte) 36);
        userService.saveUser("Petr", "Saveliev", (byte) 35);
        userService.saveUser("Alexandr", "Kozlov", (byte) 45);

        list = userService.getAllUsers();
        list.forEach(System.out::println);

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
