package String;

public class Test8 
{
	public static void main(String[] args) 
	{
		/*String s1="India";
		String s2="India";
		String s3=new String("India");
		
		 System.out.println(s1==s2); 
		 System.out.println(s1==s3); 
		
		  System.out.println(s1.equals(s2)); 
		 System.out.println(s1.equals(s3));  
		 
		 String s6 = "Ravi";
		   String s7 = "Raj";
		   System.out.println(s6.compareTo(s7)); //
		   */
		   
		   String s1 = new String("india");
			 String s2 = new String("india");
			 System.out.println(s1 == s2); 

			 s1 = s1.intern();
			 s2 = s2.intern();
			 System.out.println(s1 == s2);


			 String s3 = "Hyd";
			 String s4 = new String("Hyd");
			 System.out.println(s3 == s4);
			 s4 = s4.intern();
			 System.out.println(s3 == s4); 

			 String s5 = s4.intern();
			 System.out.println(s3 == s5); 
			 
			 /*
			  * F
			  * T
			  * F
			  * T
			  * T
			  */

	}
}
