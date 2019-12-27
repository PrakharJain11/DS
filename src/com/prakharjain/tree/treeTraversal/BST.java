package com.prakharjain.tree.treeTraversal;

public class BST {
	
	public Node createNewNode(int k)
	{
		Node a = new Node();
		a.data = k;
		a.leftChild = null;
		a.rightChild = null;
		
		return a;
	}
	
	public Node insertNewNode(Node node, int val)
	{
		if(node == null)
		{
			return createNewNode(val);
		}
		
		if(val < node.data)
		{
			node.leftChild = insertNewNode(node.leftChild, val);
		}
		else if(val > node.data)
		{
			node.rightChild = insertNewNode(node, val);
		}
		return node;
		
	}
	
}
