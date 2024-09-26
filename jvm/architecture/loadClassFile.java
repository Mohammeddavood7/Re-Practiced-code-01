package jvm.architecture;

class Player{}
class Employee{}
class Student{}

public class loadClassFile
{
	public static void main(String[] args)
	{
		Class<?> cls = null;
		cls = Player.class;
		System.out.println(cls.getName());
		
	}

}
















