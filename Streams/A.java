package Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class A
{
	public static void main(String[] args) 
	{
		
		
		/*List<String> asList = Arrays.asList("Jyoti","Ankit","Vaibhab","Aman");
		
		asList.stream().flatMap(str -> Stream.of(str.charAt(0))).forEach(ch -> System.out.print(ch));
		String[] array = {"a", "b", "c", "d", "e"};
		System.out.println();
		Stream<String> stream = Arrays.stream(array, 1, 4); // Elements "b", "c", "d"
		stream.forEach(s->System.out.println(s));
		*/
		
		/*Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		Stream<Integer> limitedStream = numbers.limit(6);
		
		limitedStream.forEach(System.out::println);
		*/

		/*Stream<String> s = Stream.of("Virat", "Rohit", "Dhoni", "Zaheer", "Raina","Sahwag","Sachin","Bumrah");
		s.skip(3).limit(4).forEach(System.out::println);
		
		*/
		
		
		/*Stream<String> numbers = Stream.of("Apple","Mango","Grapes","Kiwi","pomogranate");
		
		List<Integer> doubledNumbers = numbers
		    .peek(str -> System.out.println("Peeking from Original: " + str.toUpperCase()))
		    .map(num -> num.length())
		    .collect(Collectors.toList());
		System.out.println("-----------------");
		System.out.println(doubledNumbers);
		*/
		
		/* Stream<Integer> numbers = Stream.of(10,11,9,13,2,1,100);
		
		 numbers.takeWhile(n -> n > 9).forEach(System.out::println);  
		 */
	     
	     Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

			numbers.dropWhile(num -> num < 5).forEach(System.out::println);

	}
	
}










