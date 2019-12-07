package com.prakharjain.treeImpl;

public class BinaryTree {
	
	Node root;
	
	
	public void add(int data)
	{
		Node nodeToAdd = new Node(data);
		
		if(root == null)
		{
			root = nodeToAdd;
		}
		
		traverseAndAddNode(root, nodeToAdd);
		
	}
	
	private void traverseAndAddNode(Node node, Node nodeToAdd)
	{
		if(nodeToAdd.data < node.data)
		{
			if(node.leftChild == null)
			{
				node.leftChild = nodeToAdd;
			}
			else
			{
				traverseAndAddNode(node.leftChild, nodeToAdd);
			}
		}
		else if(nodeToAdd.data>node.data)
		{
			if(node.rightChild == null)
			{
				node.rightChild = nodeToAdd;
			}
			else
			{
				traverseAndAddNode(node.rightChild, nodeToAdd);
			}
		}
	}
	
	/*public void traverse()
	{
		if(root != null)
		{
			Node nodeToTraverse = root;
			if(nodeToTraverse.leftChild == null && nodeToTraverse.rightChild == null)
			{
				System.out.println(nodeToTraverse.data);
			}
			else
			{
				if(nodeToTraverse.leftChild != null)
				{
					inOrderTraversal(nodeToTraverse.leftChild);
				}
				if(nodeToTraverse.rightChild != null)
				{
					inOrderTraversal(nodeToTraverse.rightChild);
				}
			}
		}
	}*/
	
	
	public void traverse()
	{
		if(root != null)
		{
			Node nodeToTraverse = root;
			if(nodeToTraverse.leftChild == null && nodeToTraverse.rightChild == null)
			{
				System.out.println(nodeToTraverse.data);
			}
			else
			{
				preOrderTraversal(nodeToTraverse);
			}
		}
	}
	
	/*private void inOrderTraversal(Node node)
	{
		if(node.leftChild != null)
		{
			inOrderTraversal(node.leftChild);
		}
		
		System.out.println(node.data);
		 
		if(node.rightChild!=null)
		{
			inOrderTraversal(node.rightChild);
		}
		
	}
	*/
	private void preOrderTraversal(Node node)
	{
		System.out.println(node.data);
		
		if(node.leftChild != null)
		{
			preOrderTraversal(node.leftChild);
		}
				 
		if(node.rightChild!=null)
		{
			preOrderTraversal(node.rightChild);
		}
		
	}
}

