package com.java8.methodReference;

import com.java8.lambda.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ForEachExample {

  public static void main(String args[]) {
    List<Person> people = Arrays.asList(
        new Person("Chad", "Chor", 20),
        new Person("Abis", "Mathew", 24),
        new Person("Chabi", "Boss", 45),
        new Person("Moti", "Chaurasia", 35),
        new Person("Patla", "Agume", 35));

    //for each
    people.forEach(System.out::println);
  }
}
