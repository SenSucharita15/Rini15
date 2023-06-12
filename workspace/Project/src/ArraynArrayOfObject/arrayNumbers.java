package ArraynArrayOfObject;

public class arrayNumbers {
	
int []array1=new int[10];
//int count;
  
   void printNumbers()
   {
	  int count=0;
	 //  System.out.println("enter the range of number ");
	 //  Scanner sc=new Scanner(System.in);
	   for(int i=1;count<10;i++)
	   {
		   if (i%3==0 && i%5==0 )
		   {
			  array1[count]=i;
			   
		   count++;
		 //  System.out.print(array1[count] + " ");
	   
	   }
        }
	   System.out.println("The first 10 numbers divisible by 3 and 5 are");
  for (int i = 0; i < 10; i++)
	   
   {
    
	   System.out.print(array1[i] + " ");
  
         }
   }
}

