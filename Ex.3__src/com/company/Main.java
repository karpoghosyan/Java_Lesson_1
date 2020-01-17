package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        User user1 = new User();
        user1.setRole(Role.ADMINISTRATOR);
        user1.setUsername("Mher   ");
        User user2 = new User();
        user2.setRole(Role.ADMINISTRATOR);
        user2.setUsername("Ruzanna");
        User user3 = new User();
        user3.setRole(Role.CUSTOMER);
        user3.setUsername("Karen  ");
        User user4 = new User();
        user4.setRole(Role.CUSTOMER);
        user4.setUsername("Aida   ");
        User user5 = new User();
        user5.setRole(Role.CUSTOMER);
        user5.setUsername("Anush  ");
        User user6 = new User();
        user6.setRole(Role.CUSTOMER);
        user6.setUsername("Arman  ");
        User user7 = new User();
        user7.setRole(Role.CUSTOMER);
        user7.setUsername("Hasmik ");
        User user8 = new User();
        user8.setRole(Role.CUSTOMER);
        user8.setUsername("Hovsep ");
        User user9 = new User();
        user9.setRole(Role.CUSTOMER);
        user9.setUsername("Mark   ");
        User user10 = new User();
        user10.setRole(Role.CUSTOMER);
        user10.setUsername("Mesrop ");

        ArrayList<User>users = new ArrayList<>();

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);
        users.add(user9);
        users.add(user10);

        for (int i = 0; i <users.size() ; i++) {
            System.out.print(users.get(i).getUsername() + "  ");
            System.out.println(users.get(i).getRole());
        }
    }
}
