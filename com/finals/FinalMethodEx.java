package com.finals;


/*class A
{
	protected int a = 10;
	protected int b = 20;

     public final void calculate()
	  {
		int sum = a+b;
		System.out.println("Sum is :"+sum);
	  } 
}
class B extends A
{	
	@Override
	public void calculate() 
	{
		int mul = a*b;
		System.out.println("Mul is :"+mul);	
	}
}
public class FinalMethodEx 
{
	public static void main(String [] args) 
	{
		 A a1 = new B();
		 a1.calculate();
	}
}
*/

interface MyInterface 
{
	void a();
	void b();
	
}

interface AddI extends MyInterface
{
	void c();
}

class DupAddI extends A implements AddI
{

	@Override
	public void c() {
		
	}
	
}

class A implements MyInterface
{

	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		
	}

}

class B implements MyInterface
{

	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		
	}
	
}
























