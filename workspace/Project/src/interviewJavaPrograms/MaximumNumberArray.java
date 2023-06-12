package interviewJavaPrograms;

import java.util.*;

public class MaximumNumberArray {

	int[] arr = new int[5];
	Scanner sc = new Scanner(System.in);

	void findMaximumNumber() {

		System.out.println("Enter the numbers is the array");
		{
			for (int i = 0; i < arr.length; i++)
				arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		 int max=0;
		 for(int i=0;i<arr.length;i++)
		 {
			 if(max<arr[i])
				 max=arr[i];
		 }
		 System.out.println("The maximum number is "+max);
		// System.out.println("The second largest number is "+(arr.length-1));
		 
		 int small=arr[0];
		 for(int i=0;i<arr.length;i++)
		 {
			 if(small>arr[i])
				 small=arr[i];
		 }
		 System.out.println("The smallest number is "+small);
	
	
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
		System.out.println("Array after sorting ");
			 System.out.println(Arrays.toString(arr));
			 System.out.println("The second largest number is "+(arr[arr.length-2]));
			 
			 for(int i=0;i<arr.length;i++)
			 {
				 for(int j=i+1;j<arr.length;j++)
					 if(arr[i]<arr[j])
					 {
					 int swap=arr[i];
					 arr[i]=arr[j];
					 arr[j]=swap;
					 }
				 
			 }
			System.out.println("Array after sorting decending order ");
				 System.out.println(Arrays.toString(arr));
			
		}

	}

