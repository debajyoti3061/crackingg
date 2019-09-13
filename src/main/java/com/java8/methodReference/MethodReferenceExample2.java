package com.java8.methodReference;

import com.java8.lambda.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {
  public static void main(String args[]) {
    List<Person> people = Arrays.asList(
        new Person("Chad", "Chor", 20),
        new Person("Abis", "Mathew", 24),
        new Person("Chabi", "Boss",	45),
        new Person("Moti", "Chaurasia", 35),
        new Person("Patla", "Agume", 35));

    //3.Create method to print all names
    printConditionally(people, p->true, System.out:: println); //p -> method(p)

  }


  private static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
    for (Person p : people) {
      if (predicate.test(p))
        consumer.accept(p);
    }

  }
}
