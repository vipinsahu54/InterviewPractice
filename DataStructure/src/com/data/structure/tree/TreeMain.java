package com.data.structure.tree;

public class TreeMain {

	public static void main(String[] args) {
		Tree<Integer> tree=new BinarySearchTree<>();
		tree.insert(30);
		tree.insert(12);
		tree.insert(54);
		tree.insert(74);
		tree.insert(14);
		tree.insert(23);
		tree.insert(43);
		tree.insert(34);
		System.out.println("Max Value in tree: "+tree.max());
		System.out.println("Min value in tree: "+tree.min());
		tree.print(Traversal.PRE_ORDER);
		tree.print(Traversal.IN_ORDER);
		tree.print(Traversal.POST_ORDER);
		tree.remove();
		
		System.out.println(tree.search(43));
		System.out.println(tree.search(80));
		
		tree.removeMin();
		tree.print(Traversal.IN_ORDER);
		
		tree.removeMax();
		tree.print(Traversal.IN_ORDER);
	}

}
