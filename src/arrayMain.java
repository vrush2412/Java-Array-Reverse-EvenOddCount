import java.util.Scanner;

public class arrayMain {

	public static void main(String[] args) 
	{
		//Scanner sc=new scanner;
		int arr[]={10,20,30,40,50};
		System.out.println("Elements in array are:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Reverse order :");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}

}
