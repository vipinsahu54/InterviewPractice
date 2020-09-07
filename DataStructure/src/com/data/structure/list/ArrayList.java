package com.data.structure.list;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayList<T> implements List<T> {

	private static final int DEFAULT_SIZE=10;

	private T[] data;
	private int size=0;
	
	public ArrayList() {
		this(DEFAULT_SIZE);
	}

	@SuppressWarnings("unchecked")
	public ArrayList(int size) {
		data=(T[])new Object[size];
	}

	@Override
	public void add(T t) {
		data[size++]=t;
	}

	
	@Override
	public T get(int index) {
		return data[index];
	}

	@Override
	public T delete(T t) {
		T temp=null;
		for(int i=0; i<size; i++) {
			if(data[i].equals(t)) {
				temp=data[i];
				System.arraycopy(data, i+1, data, i, size-i);
				size--;
			}
		}
		return temp;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void print() {
		System.out.print("[");
//		for (int i=0; i<size; i++) {
//			System.out.print(data[i]+", ");
//		}
		String listData = Arrays.stream(data).filter(element -> (element!=null)).map(element -> element.toString()).collect(Collectors.joining(", "));
		System.out.println(listData+"]");
	}

	@Override
	public void clear() {
		size=0;
	}
	
	

	
}
