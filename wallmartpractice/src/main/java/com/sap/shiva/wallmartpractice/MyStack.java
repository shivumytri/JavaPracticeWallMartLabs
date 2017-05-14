package com.sap.shiva.wallmartpractice;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyStack<E> {

	private Deque<E> stack = new ArrayDeque<E>();

	public void push(E e) {
		stack.push(e);
	}

	public E pop() {
		E x = (E) stack.removeFirst();
		return x;
	}

	public E peek() {
		return (E) stack.peekFirst();
	}

	public int size() {
		return stack.size();
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

}
