package arbitaryReference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo 
{
	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(9,5,3,7,2);
		
		//By using Lambda
		Collections.sort(list,(i1,i2)->i1.compareTo(i2));
		//list.forEach(System.out::println);
		//Collections.sort(list);
		
		list.forEach(System.out::println);
//		//By Arbitrary Reference
//		Collections.sort(list,Integer::compareTo);
//		list.forEach(System.out::println);
//		
//		String[] stringArray = { "Virat","Rohit","Ajinkya","Dhoni","Aswin"};
//	    Arrays.sort(stringArray, String::compareTo);
//	    System.out.println(Arrays.toString(stringArray));

		
	}

}
