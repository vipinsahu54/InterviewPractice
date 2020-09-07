package com.data.structure.list;

public interface List<T> {
	
	public void add(T t);
	
	public T delete(T t);
	
	public T get(int index);
	
	public int size();
	
	public void print();
	
	public void clear();
	
}
