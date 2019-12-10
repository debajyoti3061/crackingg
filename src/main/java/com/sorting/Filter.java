package com.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Filter {

    public  static void main(String args[]){
        User u1 = new User(1,"vineetha","dumb");
        User u2 = new User(2,"debo","useless");
        User u3 = new User(3,"disha","ceo");
        List<User> u = new ArrayList<>();
        u.add(u1);
        u.add(u2);
        u.add(u3);

       // printconditionally(u, a -> a.getName().startsWith("d"), a -> System.out.println(a.desc));
       // printconditionally(u, a -> a.getId()==1, a -> System.out.println(a.name));
        u.stream().filter( a -> a.getName().startsWith("d")).forEach(a -> System.out.println(a.name));
        //u.stream().filter()
    }

    private static void printconditionally(List<User> u,Predicate<User> predicate,Consumer<User> consumer) {
        for(User user:u){
            if (predicate.test(user))
            consumer.accept(user);
        }
    }
}




