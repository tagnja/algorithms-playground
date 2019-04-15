
/**
 * @Description
 * Sigle LinkedList 
 *     Node first;
 *     Node last;
 *     int size;
 *     SingleLinkedList();
 *     insertAtStart();
 *     insertAtEnd();
 *     removeAtPos(int pos);
 *     print();
 * Node
 *     int data;
 *     Node next;
 *     Node(int data)
 *
 */
public class SingleLinkedList 
{
	private Node first;
	private Node last;
	private int size = 0;
	
	static class Node
	{
		private int data;
		private Node next;
		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	public SingleLinkedList()
	{
	}
	
	public void insertFirst(int data)
	{
		Node newNode = new Node(data);
		if (this.first == null)
		{
			last = newNode;
		}
		else
		{
			newNode.next = first;
			first = newNode;
		}
		this.size++;
	}
	
	public void insertLast(int data)
	{
		Node newNode = new Node(data);
		if (this.first == null)
		{
			first = newNode;
		}
		else
		{
			last.next = newNode;
		}
		last = newNode;
		size++;
	}
	
	public void removeAtPos(int pos)
	{
		if (size == 0)
		{
			System.out.println("Failed to remove! Cause by list is empty!");
		}
		if (pos > size - 1 || pos < 0)
		{
			System.out.println("Failed to remove! Cause by invalid parameter!");
		}
		Node node = first;
		if (pos == 0)
		{
			if (size > 1)
			{
				first = first.next;
			}
			if (size == 1)
			{
				first = null;
				last = null;
			}
		}

		for (int i = 1; i < size; i++)
		{
			if (pos == i)
			{
				if (pos != size - 1)
				{
					node.next = node.next.next;
				}
				else
				{
					node.next = null;
					last = node;
				}
				break;
			}
			node = node.next;
		}
	}
	
	public void print()
	{
		if (size == 0)
		{
			System.out.println("empty!");
			return;
		}
		
		Node node = first;
		while(node != null)
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
	
	public static void main(String[] args) {
		SingleLinkedList list = new SingleLinkedList();
		list.insertLast(1);
		list.insertLast(2);
		list.insertFirst(3); // 3 -> 1 -> 2
		list.removeAtPos(1); // 3 -> 2
		list.print();
		list.insertLast(6); // 3 -> 2 -> 6
		list.removeAtPos(0); // 2 -> 6
		list.insertFirst(9); // 9 -> 2 -> 6
		list.print();
	}
}
