package com.data.structure.tree;

public interface Tree<T> {

	public void clear();
	
	public void insert(T element);
	
	public T max();
	
	public T min();
	
	public T remove();
	
	public T remove(T t);
	
	public T search(T element);
	
	public int size();

	public T removeMin();
	
	public T removeMax();
	
	public void print(Traversal order);
}
