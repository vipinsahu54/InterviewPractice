package com.data.structure.hashtable;

import java.util.Arrays;

/**
 * HashTable implementation using Linear Probing (Open Addressing)
 * 
 * @author vipin sahu
 *
 * @param <K>
 * @param <E>
 */
public class HashTable<K, E> {

	private static final int DEFAULT_SIZE = 10;
	private HashNode<K, E>[] data;
	private int size;
	private int maxSize;

	public HashTable() {
		this(DEFAULT_SIZE);
	}

	@SuppressWarnings("unchecked")
	public HashTable(int size) {
		data = new HashNode[size];
		this.size = 0;
		this.maxSize = size;
	}

	public void add(K key, E element) {
		int index = getHashIndex(key);
		HashNode<K, E> node = new HashNode<>(key, element);
		if (data[index] == null) {
			data[index] = node;
		} else {
			// Linear Probing
			while (data[index] != null) {
				index = (index + 1) % maxSize;
			}
			data[index]=node;
		}
		size++;
	}

	public E remove(K key) {
		int index=getHashIndex(key);
		int temp=0;
		
		while(temp<maxSize) {
			if(data[index]!=null && data[index].getKey().equals(key)) {
				E element=data[index].getElement();
				data[index]=null;
				return element;
			}
			index=(index+1)%maxSize;
			temp++;
		}
		return null;
	}

	public E get(K key) {
		int index=getHashIndex(key);
		int temp=0;
		
		while(temp<maxSize) {
			if(data[index]!=null && data[index].getKey().equals(key))
				return data[index].getElement();
			index=(index+1)%maxSize;
			temp++;
		}
//		else if(data[index].getKey().equals(key))
//			return data[index].getElement();
//		if(data[index] != null) {
//			while(index!=temp) {
//				if(data[index].getKey().equals(key))
//					return data[index].getElement();
//				index=(index+1)%maxSize;
//			}
//		}
		return null;
	}

	private int getHashIndex(K key) {
		int hashCode = key.hashCode() & 0xfffffff;
		return hashCode % maxSize;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	
	public void print() {
		Arrays.stream(data).filter(node -> node!=null).forEach(node -> {
			System.out.println("{Key: "+node.getKey()+", Value: "+node.getElement()+"}");
		});
	}
}
