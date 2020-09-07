package com.generics.kevoo;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class MyQueues {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedBlockingDeque<>();
		new MyQueues().addElements(queue);
		System.out.println("Added "+queue.offer(6));
		System.out.println("Removed "+queue.poll());
		System.out.println("**-> "+ queue.element());
		System.out.println("**-> "+ queue.peek());
		new MyQueues().display(queue);
	}
	public Queue<Integer> addElements(Queue<Integer> queue) {
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		return queue;
	}
	public void display(Queue<Integer> queue) {
		for(Integer element: queue) {
			System.out.println(element);
		}
	}

}
