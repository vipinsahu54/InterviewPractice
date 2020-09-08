package com.data.structure.hashtable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.stream.Collectors;

import com.data.structure.model.Employee;

public class HashTableMain {

	public static void main(String[] args) {
		System.out.println("HASH TABLE LINEAR PROBING!!");
		HashTable<String, Employee> empTable=new HashTable<>(5);
		empTable.add("vipin",new Employee(101, "Vipin", 25));
		empTable.add("shiva",new Employee(102, "Shiva", 27));
		empTable.add("shivangi",new Employee(103, "Shivangi", 23));
		empTable.print();
		System.out.println(empTable.get("vipin"));
		System.out.println(empTable.remove("shiva"));
		empTable.print();
		
		
		System.out.println("HASH TABLE CHAINING!!");
		LinkedHashTable<String, Employee> linkHashTable=new LinkedHashTable<>();
		linkHashTable.add("vipin",new Employee(101, "Vipin", 25));
		linkHashTable.add("vipin",new Employee(101, "Vipin", 25));
		linkHashTable.add("shiva",new Employee(102, "Shiva", 27));
		linkHashTable.add("shivangi",new Employee(103, "Shivangi", 23));
		linkHashTable.print();
		System.out.println(linkHashTable.get("vipin"));
		System.out.println(linkHashTable.remove("shiva"));
		linkHashTable.print();
		
		System.out.println("CHALLENGE 1!!");
		challenge1();
		
		System.out.println("CHALLENGE 2!!");
		challenge2();
	}

	/**
	 * Hash Table Challenge 1
	 */
	public static void challenge1() {
		int[] nums = new int[10];
        int[] numsToAdd = { 59382, 43, 6894, 500, 99, -58 };
        for (int i = 0; i < numsToAdd.length; i++) {
            nums[hash(numsToAdd[i])] = numsToAdd[i];
        }
        print(nums);
    }

    public static int hash(int value) {
    	return Math.abs(value%10);
    }
	
    /**
     * Hash  Table Challenge 2
     */
	public static void challenge2() {
		LinkedList<Employee> list=new LinkedList<>();
		list.add(new Employee(101, "Vipin", 25));
		list.add(new Employee(103, "Shivangi", 23));
		list.add(new Employee(102, "Shiva", 27));
		list.add(new Employee(103, "Shivangi", 23));
		list.add(new Employee(102, "Aman", 24));
		
		HashMap<Integer, Employee> empTable=new HashMap<>();
		LinkedList<Employee> empList=new LinkedList<>();
		
		for(int i=0; i<list.size(); i++) {
			Employee emp=list.get(i);
			if(!empTable.containsKey(emp.getEmpId())) {
				empTable.put(emp.getEmpId(), emp);
				empList.add(emp);
			}
		}
		
		empList.stream().forEach(System.out::println);
	}
	
	public static void print(int[] array) {
		String str= Arrays.stream(array).mapToObj(String::valueOf).collect(Collectors.joining(", "));
		System.out.println("["+str+"]");
	}
}
