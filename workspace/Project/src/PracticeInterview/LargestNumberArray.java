package PracticeInterview;
import java.util.Scanner;



public class LargestNumberArray {
	int i;
	int n;
	int []arr= new int [n];
	void largestNumber()
	{
	
	
	System.out.println("Enter the number of elements to be taken");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	

	int []arr= new int [n];
	
	 for(i=0;i<arr.length;i++)
	 {
		   arr[i]=sc.nextInt();
		   
	 }
	 System.out.println("The elements are as follows");
	 int sum=0;
	 for(i=0;i<n;i++)
		 
	 {
		 //int sum=0;
		 System.out.println(arr[i]);
		 sum=sum+arr[i];
		 }
	 System.out.println("The sum of the array is"+sum);
	 
	 int max=arr[0];
	 int small=arr[0];
	 //{
		 for(i=1;i<n;i++)
		 {
			 if(max<arr[i])
				// arr[0]=arr[i];
			 max=arr[i];
			 
		 }
		
	 System.out.println("Maximum number is"+max);
	 for(i=1;i<n;i++)
	 {
		 if(small>arr[i])
			// arr[0]=arr[i];
		 small=arr[i];
			
	 }
	 System.out.println("small number is"+ small);
	 
	 for(int i=0;i<arr.length;i++)
	 {
		 for(int j=i+1;j<arr.length;j++)
			 if(arr[i]>arr[j])
			 {
			 int swap=arr[i];
			 arr[i]=arr[j];
			 arr[j]=swap;
			 }
		 
	 }
	 System.out.println("The sorted array is");
	 for(int i=0;i<arr.length;i++)
	 {
	 System.out.println(arr[i]);

	 }
	 System.out.println("The seccond largest number is"+arr[n-2]);
	 }
	
	void findNumberoftimes()
	{
		System.out.println("Enter the number of elements to be taken");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		

		int []arr= new int [n];
		
		 for(int i=0;i<arr.length;i++)
		 {
			   arr[i]=sc.nextInt();
			   
		// }
		 System.out.println("The elements are as follows"+arr[i]);
		 }
		
		 int count=0;
		 System.out.println("Enter the element which need to be checked number of time:");
		 int num=sc.nextInt();
		 for(int i=0;i<n;i++)
		 {
			 if(arr[i]==num)
			 {
			 count++;
			 }
			 
		 }System.out.println(count+ " ");
		 int j;
		 int flag=0;
	//	int counter=0;
		 System.out.println("Enter the element whose position need to be checked ");
		 int pos=sc.nextInt();
		 for(j=0;j<arr.length;j++)
		   {
			 if(arr[j]==pos)	
			 {
				 flag=1;
				 break;
		
		//		 counter++;
	         //	continue;
			 }
			 
			 else
			 {
				 flag=0;
			 }
			 
		   }
		
		 if(flag==1)
		 {
	
		 System.out.println("The position of "+pos+ "is"+arr[j]);
		   } 
		
		 else
		 {
			 System.out.println("Element not found");
		 }
		   }
	}
			 
	



	
	

