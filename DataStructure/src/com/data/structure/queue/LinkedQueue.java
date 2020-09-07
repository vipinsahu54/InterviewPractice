package com.data.structure.queue;

public class LinkedQueue<T> implements Queue<T> {

	private QueueNode<T> front;
	private QueueNode<T> tail;
	private int size;
	
	public LinkedQueue() {
		super();
		this.front=this.tail=null;
	}

	@Override
	public void add(T t) {
		QueueNode<T> temp=new QueueNode<>(t);
		
		if(this.tail==null) {
			this.front=this.tail=temp;
			size++;
			return;
		}
		
		this.tail.setNext(temp);
		this.tail=temp;
		size++;
	}

	@Override
	public T remove() {
		if(this.front==null) {
			return null;
		}
		
		T temp=this.front.getElement();
		this.front=this.front.getNext();
		this.size--;
		return temp;
	}

	@Override
	public T peek() {
		return this.front.getElement();
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void print() {
		System.out.print("[");
		StringBuilder str=new StringBuilder();
		QueueNode<T> temp=front;
		for (int i=0; i<size; i++) {
			str.append(temp.getElement()+", ");
			temp=temp.getNext();
		}
		
		System.out.println(str.substring(0, str.length()-2).toString()+"]");
	}
	
}
