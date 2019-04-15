
public class ArrayList 
{
	private int MAX_SIZE = 5;
	private int a[];
	private int currSize = 0;
	
	public ArrayList()
	{
		this.a = new int[MAX_SIZE];
	}
	
	public ArrayList(int size)
	{
		this.MAX_SIZE = size;
		this.a = new int[MAX_SIZE];
	}
	
	public void add(int data)
	{
		if (currSize + 1 > MAX_SIZE)
		{
			int arr[] = new int[MAX_SIZE * 2];
			for (int i = 0; i < currSize; i++)
			{
				arr[i] = a[i];
			}
			a = arr;
			MAX_SIZE *= 2;
		}
		a[currSize] = data;
		currSize++;
	}
	
	public void remove(int pos)
	{
		if (pos < 0 || pos > currSize -1)
		{
			System.out.println("Failed to remove! Cause by invalide parameter.");
			return;
		}
		
		if (pos == currSize - 1)
		{
			a[currSize] = 0;
			return;
		}
		
		for (int i = pos; i < currSize; i++)
		{
			a[i] = a[i+1];
		}
		currSize--;
	}
	
	public int get(int pos)
	{
		if (pos < 0 || pos > currSize - 1)
		{
			System.out.println("Failed to get! Cause by over range of list!");
		}
		return a[pos];
	}
	public void print()
	{
		for (int i = 0; i < currSize; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(1);
		System.out.println("size: "+list.currSize);
		list.add(2);
		System.out.println("size: "+list.currSize);
		list.add(3);
		System.out.println("size: "+list.currSize);
		list.print();
		
		list.add(4);
		System.out.println("size: "+list.currSize);
		list.remove(1);
		System.out.println("size: "+list.currSize);
		list.print();
		
		list.add(5);
		System.out.println("size: "+list.currSize);
		list.add(6);
		System.out.println("size: "+list.currSize+ ",maxSize: "+ list.MAX_SIZE);
		list.print();
		
		list.add(7);
		System.out.println("size: "+list.currSize + ",maxSize: "+ list.MAX_SIZE);
		list.print();
		System.out.println("list[3]: " + list.get(3));
	}
}
