package com.data.structure.list;

public class DoubleNode<T> {

	private T element;
	private DoubleNode<T> previous;
	private DoubleNode<T> next;
	
	public T getElement() {
		return element;
	}
	public void setElement(T element) {
		this.element = element;
	}
	public DoubleNode<T> getPrevious() {
		return previous;
	}
	public void setPrevious(DoubleNode<T> previous) {
		this.previous = previous;
	}
	public DoubleNode<T> getNext() {
		return next;
	}
	public void setNext(DoubleNode<T> next) {
		this.next = next;
	}
	
}
