package Files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File2
{
     public static void main(String s[]) throws IOException
     {   
    	 @SuppressWarnings("resource")
		var fos = new FileOutputStream("D:\\Hyderabad.txt");
    	 String s1 = "hi hello namaste";
    	 byte[] bytes = s1.getBytes();
    	 fos.write(bytes);
    	 
		var fin = new FileInputStream("D:\\Hyderabad.txt");

		 try(fin)
		 {
			 int i = 0;
			while((i = fin.read()) != -1)
			{
			  	
			    System.out.print((char)i);
				
			}
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
		 System.out.println();
     }
}
