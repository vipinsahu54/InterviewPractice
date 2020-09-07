package com.data.structure.list;

public class DoubleLinkedList<T> implements List<T> {

	private DoubleNode<T> root;
	private int size;
	
	@Override
	public void add(T t) {
		DoubleNode<T> node=new DoubleNode<>();
		node.setElement(t);
		node.setNext(root);
		size++;
		this.root=node;
	}

	@Override
	public T delete(T t) {
		DoubleNode<T> node=root;
		T temp=null;
		if(node.getElement().equals(t)) {
			temp=node.getElement();
			root=node.getNext();
			size--;
			return temp;
		}
		for(int i=0; i<size; i++) {
			if(node.getNext().getElement().equals(t)) {
				temp=node.getNext().getElement();
				if(node.getNext()!=null)
					node.setNext(node.getNext().getNext());
				else
					node.setNext(null);
				size--;
				return temp;
			}
			node=node.getNext();
		}
		return null;
	}

	@Override
	public T get(int index) {
		DoubleNode<T> node=root;
		for(int i=0; i<size; i++) {
			if(i==index)
				return node.getElement();
			node=node.getNext();
		}
		return null;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void print() {
		System.out.print("[");
		DoubleNode<T> node=root;
		for (int i=0; i<size; i++) {
			System.out.print(node.getElement()+", ");
			node=node.getNext();
		}
		System.out.println("]");		
	}

	@Override
	public void clear() {
		size=0;
	}
	
}
