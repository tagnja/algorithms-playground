package com.taogen.ds;

/**
 * @Description
 * DoubleLinkedList
 * 	   Node first;
 *     Node last;
 * 	   int size;
 * 	   SingleLinkedList();
 *     insertFirst();
 *     insertLast();
 *     removeAtPos(int pos);
 *     print();
 * Node
 *     int data;
 *     Node next;
 *     Node prev
 *     Node(int data)
 *
 */
public class DoubleLinkedList 
{
	private Node first;
	private Node last;
	private int size = 0;
	
	static class Node
	{
		private int data;
		private Node next;
		private Node prev;
		public Node(int data)
		{
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	
	public DoubleLinkedList()
	{}
	
	public void insertFirst(int data)
	{
		Node newNode = new Node(data);
		Node f = first;
		first = newNode;
		first.next = f;
		if (f == null)
		{
			last = newNode;
		}
		else
		{
			f.prev = first;
			first.next = f;
		}
		size++;
	}
	
	public void insertLast(int data)
	{
		Node newNode = new Node(data);
		Node l = last;
		last = newNode;
		if (first == null)
		{
			first = newNode;
		}
		else
		{
			l.next = newNode;
			newNode.prev = l;
		}
		size++;
	}
	
	public void removeAtPos(int pos)
	{
		if (size <= 0)
		{
			System.out.println("Failed to remove! Cause by list is empty!");
		}
		
		if (pos < 0 || pos > size - 1)
		{
			System.out.println("Failed to remove! Cause by invalid paramter.");
		}
		
		Node node = first;
		for (int i = 0; i < size; i++)
		{
			if (pos == i)
			{
				if (node.prev == null)
				{
					first = null;
					last = null;
				}
				else
				{
					if (node.next != null)
					{
						node.prev.next = node.next;
						node.next.prev = node.prev;
					}
					else
					{
						node.prev.next = node.next;
					}
				}
				break;
			}
			node = node.next;
		}
		size--;
	}
	
	public void print()
	{
		if (size == 0)
		{
			System.out.println("list is empty!");
		}
		Node node = first;
		while (node != null)
		{
			System.out.print(node.data);
			if (node.next != null)
			{
				System.out.print("->");
			}
			node = node.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		DoubleLinkedList list = new DoubleLinkedList();
		list.insertLast(1);
		System.out.println("size: " + list.size);
		list.insertLast(2);
		System.out.println("size: " + list.size);
		list.insertFirst(3);
		System.out.println("size: " + list.size);
		list.print();
		list.removeAtPos(1);
		System.out.println("size: " + list.size);
		list.print();
		list.insertLast(8);
		System.out.println("size: " + list.size);
		list.print();
		list.removeAtPos(2);
		System.out.println("size: " + list.size);
		list.print();
	}
}
