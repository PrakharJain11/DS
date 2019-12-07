package com.prakharjain.tree;

public class BSTApp {
	public static void main(String[] args)
	{
		BST a = new BST();
		Node root = null;
		
		root = a.insert(root, 8);
		System.out.println("Data: "+root.data);
		root = a.insert(root, 3);	
		
	}
}
