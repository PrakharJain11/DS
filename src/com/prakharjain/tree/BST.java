package com.prakharjain.tree;

public class BST {
	
	public Node createNewNode(int data)
	{
		Node a = new Node();
		a.data = data;
		a.left = null;
		a.right = null;
		
		return a;
	}
	
	public Node insert(Node node, int value)
	{
		if(node == null)
		{
			return createNewNode(value);
		}
		if(value < node.data)
		{
			node.left = insert(node.left,value);
		}
		else if(value > node.data)
		{
			node.right = insert(node.right,value);
		}
		
		return node;
	}
	
	public Node delete(Node node, int val)
	{
		if(node == null)
		{
			return null;
		}
		if(val < node.data)
		{
			node.left = delete(node.left, val);
		}
		else if(val > node.data)
		{
			node.right = delete(node.right, val);
		}
		else
		{
			if(node.left == null || node.right == null)
			{
				Node temp = null;
				temp = node.left == null ? node.right : node.left;
				
				if(temp == null)
				{
					return null;
				}
				else
				{
					return node;
				}
			}
			else
			{
				//Node successor = getSuccessor(node);
			}
		}
		return node;
	}
}
