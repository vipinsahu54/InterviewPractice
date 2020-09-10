package com.data.structure.tree;

public class BinarySearchTree<T extends Comparable<? super T>> implements Tree<T>{

	private Node<T> root;
	private int size;

	public BinarySearchTree() {
		clear();
	}

	@Override
	public void clear() {
		root = null;
		size=0;
	}

	@Override
	public void insert(T element) {
		this.root = insertNode(root, element);
		size++;
	}
	
	private Node<T> insertNode(Node<T> root, T element) {
		if(root == null) {
			return new Node<>(element);
		}
		if(root.getData().compareTo(element) > 0)
			root.setLeft(insertNode(root.getLeft(), element));
		else if(root.getData().compareTo(element) < 0)
			root.setRight(insertNode(root.getRight(), element));
		return root;
	}

	@Override
	public T max() {
		Node<T> node=this.root;
		T temp=null;
		while (node!=null) {
			temp=node.getData();
			node=node.getRight();
		}
		return temp;
	}

	@Override
	public T min() {
		Node<T> node=this.root;
		T temp=null;
		while (node!=null) {
			temp=node.getData();
			node=node.getLeft();
		}
		return temp;
	}

	@Override
	public T remove() {
		T temp=this.root.getData();
		this.root = removeNode(root, temp);
		size--;
		return temp;
	}

	private Node<T> removeNode(Node<T> root, T element) {
		if(root == null)
			return null;
		if(root.getData().compareTo(element) > 0)
			removeNode(root.getLeft(), element);
		else if(root.getData().compareTo(element) < 0)
			removeNode(root.getRight(), element);
		else {
			root.setData(getMin(root.getRight()).getData());
			root.setRight(removeMin(root.getRight()));
		}
		return root;
	}
	
	@Override
	public T removeMin() {
		return removeMin(root).getData();
	}

	@Override
	public T removeMax() {
		return removeMax(root).getData();
	}

	private Node<T> removeMin(Node<T> root){
		if(root.getLeft()==null) {
			return root.getRight();
		}
		root.setLeft(removeMin(root.getLeft()));
		return root;
	}
	
	private Node<T> removeMax(Node<T> root){
		if(root.getRight() == null){
			return root.getLeft();
		}
		root.setRight(removeMax(root.getRight()));
		return root;
	}
	
	public Node<T> getMin(Node<T> root){
		if(root.getLeft() == null)
			return root;
		return getMin(root.getLeft());
	}
	
	@Override
	public T remove(T element) {
		this.root =removeNode(root, element);
		size--;
		return element;
	}

	@Override
	public T search(T element) {
		return findNode(root, element);
	}
	
	private T findNode(Node<T> root, T element) {
		if(root==null)
			return null;
		if(root.getData().compareTo(element) > 0)
			return findNode(root.getLeft(), element);
		else if(root.getData().compareTo(element) < 0)
			return findNode(root.getRight(), element);
		else
			return root.getData();
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void print(Traversal order) {
		StringBuilder output=new StringBuilder();
		switch (order) {
		case IN_ORDER:
			System.out.println("IN ORDER");
			inOrder(root, output);
			break;
		case PRE_ORDER:
			System.out.println("PRE ORDER");
			preOrder(root, output);
			break;
		case POST_ORDER:
			System.out.println("POST ORDER");
			postOrder(root, output);
			break;
		default:
			System.out.println("Invalid Traversal Order!!");
			break;
		}
		System.out.println("BinarySearchTree ["+output.substring(0, output.length()-2)+"]");
	}
	
	private StringBuilder inOrder(Node<T> root,StringBuilder output) {
		if(root.getLeft()!=null)
			inOrder(root.getLeft(), output);
		output.append(root.getData()+", ");
		if(root.getRight()!=null)
			inOrder(root.getRight(), output);
		return output;
	}
	
	private StringBuilder preOrder(Node<T> root,StringBuilder output) {
		output.append(root.getData()+", ");
		if(root.getLeft()!=null)
			inOrder(root.getLeft(), output);
		if(root.getRight()!=null)
			inOrder(root.getRight(), output);
		return output;
	}

	private StringBuilder postOrder(Node<T> root,StringBuilder output) {
		if(root.getLeft()!=null)
			inOrder(root.getLeft(), output);
		if(root.getRight()!=null)
			inOrder(root.getRight(), output);
		output.append(root.getData()+", ");
		return output;
	}
}
