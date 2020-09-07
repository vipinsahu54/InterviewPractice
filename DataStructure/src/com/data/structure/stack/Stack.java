package com.data.structure.stack;

public interface Stack<T> {

	public void push(T t);
	
	public T pop();
	
	public T peek();
	
	public int size();
	
	public void print();
}
