package MayInterviewJava;

import java.util.*;

public class Java {

	int[] arr = new int[5];

	public void CheckDuplicate()
	
	{
	int count=0;
		System.out.println("Enter the array elements");
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<5;i++)
	{
		arr[i]=sc.nextInt();
		System.out.println(arr[i]);
		
		
	}
	 for(int i=0;i<5;i++)
	 {
		for(int j=i+1;j<5;j++)
		{
			if(arr[i]==arr[j])
         count++;

             
	//System.out.println(arr[i]);
       }
		System.out.println(arr[i]);
		System.out.println(count);
		}
	}
}
