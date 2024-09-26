package collections;

import java.util.PriorityQueue;

public class S 
{
	public static void main(String[] args)
	{
		    PriorityQueue<String> pq = new PriorityQueue<>();
            pq.add("1");
			pq.add("4");
			pq.add("2");
			pq.add("3");
			pq.add("6");	
			
			System.out.println(pq); 
			
		//	[1, 3, 2, 4, 6]
			
			//System.out.println(pq.poll());
			

			System.out.println(pq.remove("6"));
			System.out.println(pq);


		
	}

}
























