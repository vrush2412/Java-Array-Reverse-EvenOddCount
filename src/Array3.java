import java.util.Scanner;

public class Array3 {
//EVEN ODD NUMBER COUNTER PROGRAM
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int ecnt=0;
		int ocnt=0;
		System.out.println("How many elements you want in arry");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements in array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]%2==0)
			{
				ecnt++;
			}
			else
			{
				ocnt++;
			}
		}
		System.out.println("Total even numbers are :"+ecnt);
		System.out.println("Total odd  numbers are :"+ocnt);

	}

}
