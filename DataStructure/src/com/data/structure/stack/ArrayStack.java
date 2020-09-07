package com.data.structure.stack;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayStack<T> implements Stack<T> {

	private static final int DEFAULT_SIZE=10;
	private T[] data;
	private int size;
	private int top;
	
	public ArrayStack() {
		this(DEFAULT_SIZE);
	}

	@SuppressWarnings("unchecked")
	public ArrayStack(int size) {
		data=(T[])new Object[size];
		this.top=0;
		this.size=0;
	}

	@Override
	@SuppressWarnings("unchecked")
	public void push(T t) {
		if(this.size==data.length) {
			T[] newArray= (T[])new Object[2*data.length];
			System.arraycopy(data, 0, newArray, 0, data.length);
			this.data=newArray;
		}
		size++;
		data[top++]=t;
	}

	@Override
	public T pop() {
		if(size==0)
			return null;
		T temp=data[--top];
		data[top]=null;
		size--;
		return temp;
	}

	@Override
	public T peek() {
		if(size==0)
			return null;
		return data[(top-1)];
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void print() {
		System.out.print("[");
		String str=Arrays.stream(data).filter(element -> element!=null).map(element -> element.toString()).collect(Collectors.joining(", "));
		System.out.println(str+"]");
	}

}
