package com.prakharjain.tree.treeTraversal;

public class Node {
	
	public Node leftChild;
	public Node rightChild;
	protected int data;
	
	public Node() {
		leftChild = null;
		rightChild = null;
		data = 0; 
		}
	
	public Node(int value)
	{
		leftChild = rightChild = null;
		this.data = value;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	
	
	
}
