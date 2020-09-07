package com.data.structure.queue;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Circular Array Queue Implementation
 * 
 * @author vipin sahu
 *
 * @param <T>
 */
public class ArrayQueue<T> implements Queue<T> {

	private static final int DEFAULT_SIZE=10;
	private T[] data;
	private int front;
	private int back;
	private int size;
	
	public ArrayQueue() {
		this(DEFAULT_SIZE);
	}

	@SuppressWarnings("unchecked")
	public ArrayQueue(int size) {
		this.data=(T[])new Object[size];
		this.size=0;
		this.front=0;
		this.back=0;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void add(T element) {
		if(size() == data.length -1) {
			T[] temp= (T[])new Object[2 * data.length];
			
			System.arraycopy(data, front, temp, 0, data.length-front);
			System.arraycopy(data, 0, temp, data.length-front, back);
			this.data=temp;
			this.front=0;
			this.back=size();
		}
		data[back]=element;
		
		if(back < data.length-1) {
			back++;
		}
		else {
			back=0;
		}
		size++;
	}

	@Override
	public T remove() {
		if(size()==0)
			return null;
		
		T temp=data[front];
		data[front]=null;
		front++;
		size--;
		
		if(size()==0) {
			front=0;
			back=0;
		}
		else if(front==data.length) {
			front=0;
		}
		return temp;
	}
	
	@Override
	public T peek() {
		return data[front];
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
