package com.java8.streams;

import com.java8.lambda.Person;

import java.util.Arrays;
import java.util.List;

public class SreamsExample {
  public static void main(String args[]) {
    List<Person> people = Arrays.asList(
        new Person("Chad", "Chor", 20),
        new Person("Abis", "Mathew", 24),
        new Person("Chabi", "Boss",	45),
        new Person("Moti", "Chaurasia", 35),
        new Person("Patla", "Agume", 35));

    people.stream()
        .filter(p -> p.getLastName().startsWith("C"))
        .forEach(System.out::println);

    System.out.println(people.parallelStream()
        .filter(p -> p.getLastName().startsWith("C"))
        .count());
  }
}
