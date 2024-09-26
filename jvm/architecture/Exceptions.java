package jvm.architecture;

/*public class Exception 
{
	public static void main(String[] args)
	{
		System.out.println(0.0/0.0);
		
	}

}*/

/*public class ReturnExample
{
    public static void main(String[] args) 
    {     	
       System.out.println(methodReturningValue());        
    }	
	
	
	public static int methodReturningValue()
    {
        try
        {
            System.out.println("Try block");
            //System.out.println(10/0);
            return 10;    
        }
        catch (Exception e)
        {
            System.out.println("catch block");         
            return 20;  //return statement is compulsory  
        }
               
    }
}*/



/*class Check
{
      static
	  {
    	  try {
	       throw new FileNotFoundException();
    	  }
    	  catch(Exception e)
    	  {
    		  System.out.println(e);
    	  }
	  }
}
public class Test
{
  public static void main(String [] args)
  {
	 
     
  }
}*/




/*public class ReturnExample1 {

	public static void main(String[] args)
	{
		System.out.println(m1());
	}

	@SuppressWarnings("finally")
	public static int m1()
	{	
		try
		{
			System.out.println("Inside try");
			return 100;
		}
		catch(Exception e)
		{
			System.out.println("Inside Catch");
			return 200;
		}
		finally
		{
			System.out.println("Inside finally");
			return 300;
		}
		
		// System.out.println("....");  // Unreachable line
	}
}*/




/*import java.io.FileNotFoundException;
import java.io.IOException;

class Base
{
	public void show() throws FileNotFoundException
	{
		System.out.println("Super class method ");
	}
}
class Derived extends Base
{
	//throws is applicable but must be equal or sub class
	public void show() //throws IOException
	{
		System.out.println("Sub class method ");
	}
}

public class MethodOverridingWithThrows 
{
	public static void main(String[] args) 
	{
	  System.out.println("Overridden method may or may not throw checked exception but if it is throwing then must be same or sub class");	
	}

}*/




/*class Demo 
{
	public static void main(String[] args) 
	{
		m1(); //error -> try-catch OR throws
		System.out.println("Main");
	}

	public static void m1() throws ArithmeticException
	{
	}
}*/

public class Exceptions 
{
	public static void main(String[] args) throws Exception 
	{
		m1(); //error try catch Or throws reqd
		System.out.println("Main");
	}

	public static void m1() throws Exception
	{
	}
}

