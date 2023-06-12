package licenseProvide;

public class LicenseProvide {
	int age=18;
	//String typeOfLicense;
	boolean G1=true;
	boolean G2=true;
	boolean  G;
	
	void  licenseGiven()
	{
		if (age>=18)
		{
			System.out.println(" The Ontario License Authority can issue a icense");
			if(G1==false)
			{
				System.out.println("Issue G1 License");
			}
			else if(G1==true && G2==false)
			{
				System.out.println("Issue G2 License");
			}
			else if(G2==true && G==false)
			{
				System.out.println("Issue G License");
					}
		//	else if(G2==false)
				//else if(G2==true)
			//	{
				//	System.out.println("Issue G2 License");
					//	}
	
		}
		
		else
		{
			System.out.println(" The Ontario License Authority cannot issue a icense");
	      }
	
	}

}
