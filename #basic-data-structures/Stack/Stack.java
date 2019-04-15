
/**
 * Stack
 *     int MAX;
 *     int top;
 *     int a[MAX];
 *     isEmpty();
 *     isFull();
 *     size();
 *     push();
 *     pop();
 *     peek();
 *
 */
public class Stack 
{
	static final int MAX = 3;
	int top;
	int a[] = new int[MAX];
	
	public Stack()
	{
		top = -1;
	}
	
	boolean isEmpty()
	{
		return (top < 0);
	}
	
	boolean isFull()
	{
		return (top == MAX - 1);
	}
	
	int size()
	{
		return top + 1;
	}
	
	boolean push(int data)
	{
		if (top + 1 > MAX - 1)
		{
			System.out.println("Stack overflow!");
			return false;
		}
		else
		{
			a[++top] = data;
			return true;
		}
	}
	
	int pop()
	{
		if (top < 0)
		{
			System.out.println("Stack underflow!");
			return -1;
		}
		else
		{
			return a[top--];
		}
	}
	
	int peek()
	{
		if (top < 0)
		{
			System.out.println("Stack is empty!");
			return -1;
		}
		else
		{
			return a[top];
		}
	}
	
	public static void main(String[] args) 
	{
		Stack stack = new Stack();
		stack.push(1);
		System.out.println("top: " + stack.top);
		stack.push(2);
		System.out.println("top: " + stack.top);
		stack.push(3);
		System.out.println("size: " + stack.size());
		System.out.println("peek: " + stack.peek());
		System.out.println("isFull: " + stack.isFull());
		System.out.println("stack pop: " + stack.pop());
		System.out.println("isFull: " + stack.isFull());
		stack.push(4);
		System.out.println("top: " + stack.top);
		stack.push(5);
		System.out.println("top: " + stack.top);
		
		System.out.println("Print stack: ");
		while (! stack.isEmpty())
		{
			System.out.println(stack.pop());
		}
		System.out.println("top: " + stack.top);
	}
}
