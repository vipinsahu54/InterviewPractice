package com.data.structure.heap;

public class HeapMain {

	public static void main(String[] args) {
		MaxHeap<Integer> heap=new MaxHeap<>();
		heap.insert(30);
		heap.insert(54);
		heap.insert(12);
		heap.insert(75);
		heap.insert(34);
		heap.insert(5);
		heap.insert(3);
		heap.insert(29);
		heap.print();
		heap.remove(12);
		heap.print();
		heap.remove(75);
		heap.print();
		
		System.out.print("[");
		int size=heap.size();
		for(int i=0; i<size; i++) {
			System.out.print(heap.removeMax()+", ");
		}
		System.out.println("]");
	}

}
