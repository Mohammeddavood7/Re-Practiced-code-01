package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

class A extends Thread
{
	
	
   ArrayList<Integer> al;
   public A(ArrayList<Integer> al)
   {
	   this.al = al;
   }

	@Override
	public synchronized void run()
	{
		al.add(4);
	}
	
}

public class ConcurrentModificationExcep 
{
	public static void main(String[] args) throws InterruptedException
	{
		/*ArrayList<Integer> al = new ArrayList<>();
		A a = new A(al);
		
		a.al.add(1);
		a.al.add(2);		
		a.al.add(3);		
		a.start();
		
		Iterator<Integer> iterator = al.iterator();
		
		iterator.forEachRemaining(str -> System.out.println(str));
		*/
		
		
List<String> list = Arrays.asList("Apple", "Orange", "Mango","Kiwi", "Grapes");

		
        CopyOnWriteArrayList<String> copyOnWriteList = new CopyOnWriteArrayList<String>(list);
         
        System.out.println("Without modification = "+copyOnWriteList); 
        
		 //Iterator1
        Iterator<String> iterator1 = copyOnWriteList.iterator();
         
        //Add one element and verify list is updated
        copyOnWriteList.add("Guava");
         
        System.out.println("After modification = "+copyOnWriteList);   
         
        //Iterator2
        Iterator<String> iterator2 = copyOnWriteList.iterator();
         
        System.out.println("Element from first Iterator:");
        iterator1.forEachRemaining(System.out::println);

        System.out.println("Element from Second Iterator:");
        iterator2.forEachRemaining(System.out::println); 	
		
	}

}














