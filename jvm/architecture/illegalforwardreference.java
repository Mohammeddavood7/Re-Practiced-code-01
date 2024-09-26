package jvm.architecture;

public class illegalforwardreference 
{
	static final int x = 0;
	static
	{
		
	
		System.out.println(x);
	
		System.out.println(x);
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException 
	{
	  
		
	}
	
	

}
