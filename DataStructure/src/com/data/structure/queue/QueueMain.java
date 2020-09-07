package com.data.structure.queue;

import com.data.structure.stack.ArrayStack;
import com.data.structure.stack.Stack;

/**
 * 
 * @author vipin sahu
 *
 */
public class QueueMain {

	public static void main(String[] args) {
		Queue<Integer> intQueue=new ArrayQueue<>(5);
		intQueue.add(38);
		intQueue.add(54);
		intQueue.add(10);
		intQueue.add(76);
		intQueue.remove();
		intQueue.print();
		System.out.println(intQueue.peek());
		intQueue.add(12);
		intQueue.add(90);
		intQueue.add(89);
		intQueue.add(44);
		intQueue.remove();
		intQueue.add(55);
		intQueue.print();
		System.out.println(intQueue.peek());
		
		
		Queue<Integer> linkQueue=new LinkedQueue<>();
		linkQueue.add(39);
		linkQueue.add(45);
		linkQueue.add(75);
		linkQueue.add(24);
		linkQueue.add(54);
		linkQueue.add(35);
		linkQueue.print();
		System.out.println(linkQueue.peek());
		linkQueue.remove();
		linkQueue.print();
		System.out.println(linkQueue.peek());
		linkQueue.add(90);
		linkQueue.print();
		
		
		System.out.println("CUSTOM ARRAY QUEUE!!");
		Queue<Integer> customQueue=new CustomArrayQueue<>(5);
		customQueue.add(32);
		customQueue.add(21);
		customQueue.add(45);
		customQueue.add(23);
		customQueue.add(11);
		customQueue.print();
		customQueue.add(22);
		customQueue.add(65);
		System.out.println(customQueue.peek());
		customQueue.print();
		customQueue.remove();
		customQueue.print();
		customQueue.add(15);
		customQueue.print();
		System.out.println(customQueue.peek());
		
		System.out.println("QUEUE CHALLENGE!!");
		String ip="I dont, t nod I?";
		System.out.println(isPalindrome(ip));
	}

	/**
	 * Queue Challenge Solution
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isPalindrome(String str) {
		Queue<Character> queue= new LinkedQueue<>();
		Stack<Character> stack=new ArrayStack<>();
		
		for (char letter : str.toCharArray()) {
			if(Character.isLetter(letter)) {
				queue.add(letter);
				stack.push(letter);
			}
		}
		
		if(!(queue.remove()==stack.pop()))
			return false;
		return true;
	}
}
