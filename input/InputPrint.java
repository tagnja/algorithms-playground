
import java.util.Scanner;

public class InputPrint
{
	
	public static void main(String[] args)
	{
		System.out.println("Please input size of array: ");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int a[] = new int[size];
		System.out.println("Please input elements of array: ");
		for (int i = 0; i < size; i++)
		{
			a[i] = scan.nextInt();
		}
		scan.close();
		for (int i = 0; i <  a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
}