package com.java8.predicate;

import com.java8.lambda.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class UnitExercisewithPredicate {
    public static void main(String args[]) {
        List<Person> people = Arrays.asList(
                new Person("Chad", "Chor", 20),
                new Person("Abis", "Mathew", 24),
                new Person("Chabi", "Boss",	45),
                new Person("Moti", "Chaurasia", 35),
                new Person("Patla", "Agume", 35));
        //1.Sort list by last name

       // Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));


        //2. Create method to print all names of list
        //printallNames(people);

        //3.Create method to print names starting with last name A
        printnameswithC(people, p->p.getLastName().startsWith("A"));


    }

    private static void printallNames(List<Person> people) {
        for (Person p : people) {
            System.out.println(p);
        }

    }
    private static void printnameswithC(List<Person> people, Predicate<Person> predicate) {
        for (Person p : people) {
            if (predicate.test(p))
                System.out.println(p);
        }

    }
}
