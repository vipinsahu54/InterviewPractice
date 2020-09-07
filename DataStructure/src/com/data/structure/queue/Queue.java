/**
 * 
 */
package com.data.structure.queue;

/**
 * @author vipin sahu
 *
 */
public interface Queue<T> {

	public void add(T t);
	
	public T remove();
	
	public T peek();
	
	public int size();
	
	public void print();
	
}
