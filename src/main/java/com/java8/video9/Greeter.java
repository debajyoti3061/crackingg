package com.java8.video9;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {

		Greeter greeter = new Greeter();
		Greeting lambdaGreeting = () -> System.out.println("hello world");

		Greeting innerClassGreeting = new Greeting() {
			public void perform() {
				System.out.println("hello world");
			}
		};
		greeter.greet(lambdaGreeting);
		greeter.greet(innerClassGreeting);
		
	}
	
	
}