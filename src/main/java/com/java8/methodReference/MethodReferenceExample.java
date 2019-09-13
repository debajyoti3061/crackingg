package com.java8.methodReference;

public class MethodReferenceExample {

  public static void main(String args[]){
    Thread t = new Thread(MethodReferenceExample::print); //() ->print() === MethodReferenceExample::print
    t.start();
  }

  public static void print(){
    System.out.println("Hello");
  }
}
