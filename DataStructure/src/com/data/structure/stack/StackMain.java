package com.data.structure.stack;

import com.data.structure.model.Employee;

public class StackMain {

	public static void main(String[] args) {
		Stack<Integer> arrayStack=new ArrayStack<>();
		arrayStack.push(20);
		arrayStack.push(80);
		arrayStack.push(26);
		arrayStack.push(53);
		arrayStack.push(95);
		System.out.println(arrayStack.peek());
		arrayStack.print();
		
		Stack<Employee> empStack=new ArrayStack<>();
		empStack.push(new Employee(101, "Vipin", 25));
		empStack.push(new Employee(102, "Shiva", 27));
		empStack.push(new Employee(103, "Shivangi", 23));
		empStack.print();
		empStack.pop();
		empStack.print();
		
		Stack<Integer> linkedStack=new LinkedStack<>();
		linkedStack.push(30);
		linkedStack.push(90);
		linkedStack.push(40);
		linkedStack.push(60);
		linkedStack.print();
		linkedStack.pop();
		linkedStack.print();
		
		String input="I dont, t nod I?";
		System.out.println(isPalindrome(input));
	}

	/**
	 * Challenges problem solution
	 * 
	 * @param input
	 * @return
	 */
	public static boolean isPalindrome(String input) {
		Stack<Character> chars=new ArrayStack<>();
		char[] inputChar=input.toLowerCase().toCharArray();
		for (char c : inputChar) {
			if(Character.isLetter(c))
				chars.push(c);
		}
		
		StringBuilder inputReverse=new StringBuilder(input.toLowerCase());
		int index=0;
		while(chars.size()>0) {
			if(!Character.isLetter(inputReverse.charAt(index))) {
				index++;
				continue;
			}
			if(chars.pop()!=inputReverse.charAt(index++))
				return false;
		}
		return true;
	}
	
}
