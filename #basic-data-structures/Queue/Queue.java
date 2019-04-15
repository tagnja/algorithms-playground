
/**
 * Queue
 *     int front;
 *     int rear;
 *     int size;
 *     int a[];
 *     isEmpty();
 *     isFull();
 *     size();
 *     enqueue();
 *     dequeue();
 *     peek();
 */
public class Queue 
{
	int front, rear, size, capacity, a[];
	public Queue(int capacity)
	{
		this.capacity = capacity;
		front = size = 0;
		rear = capacity - 1;
		a = new int[capacity];
	}
	
	boolean isEmpty()
	{
		return (size == 0);
	}
	
	boolean isFull()
	{
		return (size == capacity);
	}
	
	int size()
	{
		return size;
	}
	
	void enqueue(int data)
	{
		if (isFull())
		{
			return;
		}
		rear = (rear + 1) % capacity;
		a[rear] = data;
		size++;
	}
	
	int dequeue()
	{
		if (isEmpty())
		{
			return -1;
		}
		int item = a[front];
		front = (front + 1) % capacity;
		size--;
		return item;
	}
	
	public static void main(String[] args) 
	{
		Queue queue = new Queue(3);
		queue.enqueue(1);
		System.out.println("size: " + queue.size);
		queue.enqueue(2);
		System.out.println("size: " + queue.size);
		queue.dequeue();
		System.out.println("size: " + queue.size);
		queue.enqueue(3);
		System.out.println("size: " + queue.size);
		queue.enqueue(4);
		System.out.println("isFull: "+ queue.isFull());
		System.out.println("size: " + queue.size);
		
		System.out.println("print queue: ");
		while (! queue.isEmpty())
		{
			System.out.println(queue.dequeue());
		}
		System.out.println("isEmpty: "+ queue.isEmpty());
	}
}
