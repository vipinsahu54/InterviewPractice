package com.data.structure.stack;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack<T> implements Stack<T>{

	private LinkedList<T> stack;
	
	
	public LinkedStack() {
		stack=new LinkedList<>();
	}

	@Override
	public void push(T t) {
		stack.push(t);
	}

	@Override
	public T pop() {
		return stack.pop();
	}

	@Override
	public T peek() {
		return stack.peek();
	}

	@Override
	public int size() {
		return stack.size();
	}

	@Override
	public void print() {
		ListIterator<T> iterator=stack.listIterator();
		StringBuilder builder=new StringBuilder();
		builder.append("[");
		while(iterator.hasNext()) {
			builder.append(iterator.next()+", ");
		}
		builder.delete(builder.length()-2, builder.length());
		builder.append("]");
		System.out.println(builder);
	}

}
