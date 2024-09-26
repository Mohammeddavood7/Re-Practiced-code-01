package Streams;

interface Worker
{
	void work();
}

class Employee
{
	public static void salary()
	{
		System.out.println("Employee Salary");
	}
}


public class MethodRef {
	public static void main(String[] args) 
	{
		Worker w1 = Employee::salary;
		w1.work();

	}

}
