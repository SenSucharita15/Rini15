package largestNumberFind;

//)  Find the largest of 3 given numbers.
//E.g. Given there are 3 numbers n1,n2,n3 
//where n1 =5, n2=44, n3=22
//Expected output : Largest number = 44
//
public class LargestNumber {
	int n1 = 600;
	int n2 = 600;
	int n3 = 60;
	int max;
	boolean greater;

	void findLargest() 
	 {
	    	if(n1>n2)
	  	   {
	    		if(n1>n3)
	    		{
			greater=true;
			max=n1;
			//System.out.println("The greater number is " + max);
	  	         }
		    }
		  else {
			
		     	if(n2>n3)
			     {
		  
			  greater=true;
			  max=n2;
			//  System.out.println("The greater number is " + max);
		      }
		     	else 
		        {
		     		if(n3>n2)
		     		{
			     greater=true;
			     max=n3;
		     		}
		     		else
		     		{
		     			//greater=false;
		     		System.out.println("equal number  "  );
		     		}
			    }
		     
		 }	
	  if(greater)
	      {
	 	 
	 	 	System.out.println("greatest number" + max);
	 	 }
	    else
	    {
		  System.out.println("no greatest number" );
	       }
	  }
}