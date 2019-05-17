package com.prakharjain.LinkedListImpl;

public class Node {
	
	protected int data;
	protected Node link;
	
	public Node()
	{
		link = null;
		data = 0;
	}
	
	public Node(int d,Node n)
	{
		data = d;
		link = n;
	}
	
	public void setLink(Node n)
	{
		link = n;
	}
	
	public Node getLink()
	{
		return link;
	}
	
	public void setData(int d)
	{
		data = d;
	}
	
	public int getData()
	{
		return data;
	}
	
}
