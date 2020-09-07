package com.data.structure.queue;

public class QueueNode<T> {

	private T element;
	private QueueNode<T> next;
	
	public QueueNode(T element) {
		super();
		this.element = element;
	}
	public T getElement() {
		return element;
	}
	public void setElement(T element) {
		this.element = element;
	}
	public QueueNode<T> getNext() {
		return next;
	}
	public void setNext(QueueNode<T> next) {
		this.next = next;
	}
	
}
