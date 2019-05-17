package com.prakharjain.LinkedListUtil;

import java.util.LinkedList;

public class NodeSumEqualToZero {
	public static void main(String[] args)
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(10);
		list.add(-10);
		list.add(20);
		list.add(-20);
		list.add(-5);
		list.add(11);
		list.add(8);
		list.add(8);
		list.add(-12);
		list.add(10);
		
		System.out.println(list);
		int size = list.size();
		System.out.println(size);
		for(int i = 0;  i<size; i++)
		{
			int temp = list.get(0);
			for(int j = 1; j<size-1; j++)
			{
				if (temp+list.get(j) == 0)
				{
					System.out.println("list.get(0): "+list.get(0));
					list.remove(0);
					System.out.println("list.remove(j-1): "+list.get(j-1));
					list.remove(j-1);
					size = size -2;
					System.out.println(list);
					break;
				}
			}
		}
			System.out.println(list);
		/*for(int k=0; k<size; k++)
		{
			
			System.out.println(list.get(k));
		}
	*/	
	}
}
