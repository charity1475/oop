package com.educative.consumer;

import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		/* here is a consumer of return type string + a call to an 
		 * abstract method accept */
		Consumer<String> stringConsumer = s->System.out.println(s);
		stringConsumer.accept("Hello World");
		/* here is a consumer of return type integer + a call to an 
		 * abstract method accept */
		Consumer<Integer> intConsumer = s->System.out.println(s);
		intConsumer.accept(20);
		/*and then consumer */
		Consumer<String> one = (arg)->System.out.println(arg + " My name is Charity");
		Consumer<String> two = (arg)->System.out.println(arg + " I'm from Tanzania");
		one.andThen(two).accept("Hello");
		


		
	}

}
