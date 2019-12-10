package com.java8.streams;

import com.java8.lambda.Person;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SreamsExample {
  public static void main(String args[]) {
    List<Person> people = Arrays.asList(
        new Person("Chad", "Chor", 20),
        new Person("Abis", "Mathew", 24),
        new Person("Chabi", "Boss", 45),
        new Person("Moti", "Chaurasia", 35),
        new Person("Patla", "Agume", 35));

    people.stream()
        .filter(p -> p.getLastName().startsWith("C"))
        .forEach(System.out::println);

    System.out.println(people.parallelStream()
        .filter(p -> p.getLastName().startsWith("C"))
        .count());

    /**
     * intermediate ops
     * anyMatch() distinct() filter() findFirst() flatmap() map() skip() sorted()
     */

    /**
     * teminal ops
     * count() max() min() reduce() collect() forEach()
     */

    //print 1-9
    IntStream.range(1, 10).forEach(System.out::println);

    //skip 1st 5
    IntStream.range(1, 10).skip(5).forEach(x -> System.out.println(x));

    //sum 1-4
    System.out.println(IntStream.range(1, 5).sum());

    Stream.of("Ava", "hello", "AAA").sorted().findFirst().ifPresent(System.out::println);


    String[] names = {"hi", "alex", "dome", "megu", "pete", "jack", "apple", "alex hose"};
    Arrays.stream(names).filter(x -> x.startsWith("a")).sorted((a, b) -> Integer.compare(a.length(), b.length())).forEach(System.out::println);

    //average of squares of int array
    Arrays.stream(new int[]{2, 4, 6, 8, 10}).map(x -> x * x).average().ifPresent(System.out::println);


    //sorting 2-d array
    int[][] input = {{0, 30}, {35, 45}, {20, 40}};
    Arrays.stream(input).sorted((a,b)->Integer.compare(a[0],b[0])).forEach(x -> System.out.println(x[0]+" "+x[1]));
    int output[][] =Arrays.stream(input).sorted((a,b)->Integer.compare(a[0],b[0])).toArray(int[][] :: new);

  }
}
