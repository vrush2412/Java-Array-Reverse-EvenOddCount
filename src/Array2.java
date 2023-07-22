import java.util.Scanner;

public class Array2 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter how many elements you want in array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements in arry :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Elements in arry are:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Reverse order:");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
		

	}

}
