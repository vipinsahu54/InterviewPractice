package com.data.structure.queue;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CustomArrayQueue<T> implements Queue<T> {

	private static final int DEFAULT_SIZE = 10;
	private T[] data;
	private int front;
	private int rear;
	private int size;
	private int maxSize;

	public CustomArrayQueue() {
		this(DEFAULT_SIZE);
	}

	@SuppressWarnings("unchecked")
	public CustomArrayQueue(int size) {
		data = (T[]) new Object[size];
		this.maxSize = size;
		this.front = 0;
		this.rear = 0;
		this.size = 0;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void add(T t) {
		if (size == data.length) {
			int newArrayLength=2 * data.length;
			T[] temp = (T[]) new Object[newArrayLength];

			System.arraycopy(data, front, temp, 0, data.length - front);
			System.arraycopy(data, 0, temp, data.length - front, rear);
			this.data = temp;
			this.front = 0;
			this.maxSize=newArrayLength;
			this.rear = size();
		}

		data[rear] = t;
		rear = (rear + 1) % maxSize;
		size++;
	}

	@Override
	public T remove() {
		if (size == 0)
			return null;
		T temp = data[front];
		data[front] = null;
		front = (front + 1) % maxSize;
		size--;
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
		String str = Arrays.stream(data).filter(element -> element != null).map(element -> element.toString())
				.collect(Collectors.joining(", "));
		System.out.println(str + "]");
	}

}
