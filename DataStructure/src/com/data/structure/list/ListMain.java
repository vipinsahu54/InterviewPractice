package com.data.structure.list;

import com.data.structure.model.Employee;

public class ListMain {

	public static void main(String[] args) {
		List<Integer> arrayList=new ArrayList<>();
		arrayList.add(10);
		arrayList.add(40);
		arrayList.add(20);
		arrayList.add(19);
		arrayList.add(93);
		arrayList.print();
		arrayList.delete(20);
		arrayList.print();
		System.out.println("List Size: "+arrayList.size());
		
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee(101, "Vipin", 25));
		empList.add(new Employee(102, "Shiva", 27));
		empList.add(new Employee(103, "Shivangi", 23));
		empList.print();
		empList.delete(new Employee(102, "Shiva", 27));
		empList.print();
		System.out.println(empList.get(1));
	
		List<Employee> linkList=new LinkedList<>();
		linkList.add(new Employee(101, "Vipin", 25));
		linkList.add(new Employee(102, "Shiva", 27));
		linkList.add(new Employee(103, "Shivangi", 23));
		linkList.print();
		System.out.println(linkList.get(2));
		linkList.delete(new Employee(103, "Shivangi", 23));
		linkList.delete(new Employee(101, "Vipin", 25));
		linkList.print();
		
		List<Employee> doubleLinkList=new DoubleLinkedList<>();
		doubleLinkList.add(new Employee(101, "Vipin", 25));
		doubleLinkList.add(new Employee(102, "Shiva", 27));
		doubleLinkList.add(new Employee(103, "Shivangi", 23));
		doubleLinkList.print();
	}

}
