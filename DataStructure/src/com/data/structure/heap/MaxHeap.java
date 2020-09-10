package com.data.structure.heap;

public class MaxHeap<T extends Comparable<? super T>> {

	private static final int DEFAULT_SIZE=10;
	private T[] data;
	private int size;
	
	public MaxHeap() {
		this(DEFAULT_SIZE);
	}
	
	@SuppressWarnings("unchecked")
	public MaxHeap(int size) {
		data = (T[])new Comparable[size];
		this.size=0;
	}
	
	public int left(int pos) {
		return (2*pos)+1;
	}
	
	public int right(int pos) {
		return (2*pos)+2;
	}
	
	public int parent(int pos) {
		return (int) Math.floor((pos-1)/2);
	}
	
	public boolean isLeaf(int pos) {
		return pos >= size/2 && pos < size;
	}
	
	public int size() {
		return this.size;
	}
	
	public void insert(T element) {
		if(size == data.length)
			throw new RuntimeException("Heap is full!!");
		data[size++]=element;
		shiftUp(size-1);
	}
	
	private void shiftUp(int pos) {
		if(pos <= 0)
			return;
		int index =parent(pos);
		if(data[index].compareTo(data[pos]) < 0) {
			swap(index, pos);
			shiftUp(index);
		}
	}
	
	private void shiftDown(int pos) {
		if(isLeaf(pos) || size==0)
			return;
		int left=left(pos);
		int right= right(pos);
		
		if(data[left] != null && data[right] !=null) {
			if(data[left].compareTo(data[right]) > 0 && data[left].compareTo(data[pos]) > 0) {
				swap(pos, left);
				shiftDown(left);
			}
			else if(data[right].compareTo(data[pos]) > 0) {
				swap(pos, right);
				shiftDown(right);
			}
		}
		else if(data[left].compareTo(data[pos]) > 0){
			swap(pos, left);
		}
	}
	
	public T remove(T element) {
		for (int i = 0; i < data.length; i++) {
			if(data[i].compareTo(element)==0) {
				T temp=data[i];
				swap(i, size-1);
				data[size-1]=null;
				size--;
				shiftDown(i);
				return temp;
			}
		}
		return null;
	}
	
	public T removeMax() {
		if(size == 0)
			throw new RuntimeException("Heap is empty!!");
		T temp=data[0];
		remove(temp);
		return temp;
	}
	
	private void swap(int src, int des) {
		T temp=data[src];
		data[src]=data[des];
		data[des]=temp;
	}
	
	public void print() {
		StringBuilder str=new StringBuilder();
		
		for (T t : data) {
			if(t!=null)
				str.append(t+", ");
		}
		System.out.println("["+str.substring(0, str.length()-2)+"]");
	}
}
