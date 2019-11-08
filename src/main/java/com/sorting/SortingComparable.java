package com.sorting;

import java.util.*;

public class SortingComparable {
    public static void main(String[] args){
        User user1 = new User(1,"debo","good boy");
        User user2 = new User(2,"vineetha","chandi girl");;
        User user3 =  new User(-1,"disha","good girl");;

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        Collections.sort(users);
        users.forEach(user -> {System.out.println(user.name);});

        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                return Integer.compare(u1.id,u2.id);
            }
        });
        users.forEach(user -> {System.out.println(user.name);});
    }
}
