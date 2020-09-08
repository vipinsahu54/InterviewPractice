package com.data.structure.hashtable;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Implementation of Hash Table using Linear Chaining
 * 
 * @author vipin sahu
 *
 * @param <K>
 * @param <E>
 */
public class LinkedHashTable<K, E> {

	private static final int DEFAULT_SIZE=10;
	private LinkedList<HashNode<K, E>>[] hashTable;
	private int size;
	
	public LinkedHashTable() {
		this(DEFAULT_SIZE);
	}

	@SuppressWarnings("unchecked")
	public LinkedHashTable(int size) {
		hashTable=new LinkedList[size];
		for(int i=0; i<hashTable.length; i++)
			hashTable[i]=new LinkedList<>();
		this.size=0;
	}
	
	public void add(K key, E element) {
		HashNode<K, E> node =new HashNode<>(key, element);
		int index=getHashIndex(key);
		
		if(!isContain(key)) {
			hashTable[index].add(node);
		}
		size++;
	}
	
	/**
	 * Method used for removing the element from the hash table.
	 * 
	 * @param key
	 * @return
	 */
	public E remove(K key) {
		for (LinkedList<HashNode<K, E>> linkedList : hashTable) {
			int index=0;
			for (HashNode<K, E> hashNode : linkedList) {
				if(hashNode.getKey().equals(key)) {
					E temp= hashNode.getElement();
					linkedList.remove(index);
					return temp;
				}
				index++;
			}
		}
		return null;
	}
	
	/**
	 * Method used for getting the element of the provided key if present,
	 * Else return NULL.
	 * 
	 * @param key
	 * @return
	 */
	public E get(K key) {
		for (LinkedList<HashNode<K, E>> linkedList : hashTable) {
			for (HashNode<K, E> hashNode : linkedList) {
				if(hashNode.getKey().equals(key)) {
					return hashNode.getElement();
				}
			}
		}
		return null;
	}
	
	public int size() {
		return this.size;
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
	/**
	 * Method used for getting the hashed index of the key.
	 * 
	 * @param key
	 * @return
	 */
	private int getHashIndex(K key) {
		int hashCode = key.hashCode() & 0xfffffff;
		return hashCode % hashTable.length;
	}

	/**
	 * Checks whether the key is present or not.
	 * 
	 * @param key
	 * @return
	 */
	public boolean isContain(K key) {
		for (LinkedList<HashNode<K, E>> linkedList : hashTable) {
			for (HashNode<K, E> hashNode : linkedList) {
				boolean status = hashNode.getKey().equals(key);
				
				if(status)
					return status;
			}
		}
		return false;
	}
	
	/**
	 * Prints the Hash Table
	 */
	public void print() {
		Arrays.stream(hashTable).filter(list -> !list.isEmpty()).forEach(list -> {
			for (HashNode<K, E> node : list) {
				System.out.println("{Key: "+node.getKey()+", Value: "+node.getElement()+"}");
			}
		});
	}
}
