package interviewJavaPrograms;
import java.io.*;


public class ReadAFile {

	public static void main(String[] args) throws IOException    {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\santa\\OneDrive\\Desktop\\name.txt");
	//	@SuppressWarnings("resource")
		BufferedReader br;
		
			br = new BufferedReader(new FileReader (file));
				
			String str;
		try {
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
                 }
		
		}
		 catch (FileNotFoundException e) {
				
				System.out.println(e);
			}

	}

}
