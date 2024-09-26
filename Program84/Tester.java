package Program84;

import java.util.List;

public class Tester 
{
	
   public static void main(String[]args)
	{
		List<Employee> list = EmployeeAdder.addDetails();

	//1	list.stream().filter(f->f.getGender().equalsIgnoreCase("female")).forEach(System.out::println);
		
	//2	list.stream().filter(f->f.getAge()>30).forEach(System.out::println);

	//3	list.stream().map(s->s.getName()).forEach(System.out::println);
		
    //5	double orElse = list.stream().mapToDouble(Employee::getSalary).average().orElse(0);
	
    //6	OptionalDouble max = list.stream().mapToDouble(Employee::getSalary).max();
    //		System.out.println(max);
	
	//7	Map<String, List<Employee>> collect = list.stream().collect(Collectors.groupingBy(Employee::getGender ));
       
	/*8 long count = list.stream().filter(m->m.getGender().equalsIgnoreCase("male")).count();
	System.out.println(count);*/
		
	/*9 double sum = list.stream().mapToDouble(Employee::getSalary).sum();
	System.out.println(sum);*/
	
	//10	list.stream().sorted((a,b)->a.getName().compareTo(b.getName())).forEach(System.out::println);
	
		
	}
   
}























