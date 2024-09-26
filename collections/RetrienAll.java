package collections;

import java.util.ArrayList;
import java.util.List;

public class RetrienAll
{

	public static void main(String[] args) 
	{
		/*ArrayList<String> al3=new ArrayList<>();
		  al3.add("Ravi");
		  al3.add("Rahul");
		  al3.add("Rohit");		  
		  
		  ArrayList<String> al4=new ArrayList<>();
		  al4.add("Pallavi");
		  al4.add("Rahul");
		  al4.add("Raj");
		  
		  al3.retainAll(al4);  
		
		al3.forEach(x -> System.out.println(x));*/

		/*LinkedList<String> city = new LinkedList<> ();
		 city.add("Kolkata");
		 city.add("Bangalore");
		 city.add("Hyderabad");
		 city.add("Pune");
		 System.out.println(city);   
		
		ListIterator<String> lt = city.listIterator();
		
		while(lt.hasNext())
		  {
			String cityName =  lt.next();
		
			if(cityName.equals("Kolkata"))
			{
		         lt.remove();
			}
			else if(cityName.equals("Hyderabad"))
			{
		         lt.add("Ameerpet");
			}
			else if(cityName.equals("Pune"))
			{
		         lt.set("Mumbai");
			}
		}
		city.forEach(System.out::println);
		
				
		 * B
		 * H
		 * A
		 * M
				*/
		
		
		/*Vector<Integer> v = new Vector<>();
		v.addElement(12);
		v.addElement(18);
		v.addElement(20);
		
		v.removeElement(Integer.valueOf(18)); //based on the object
		v.removeElementAt(0); //based on the index
		
		System.out.println(v);
		*/
		
		
		
		
//		Stack<String> stk= new Stack<>();  
//		stk.push("Apple");//0  //3
//		stk.push("Grapes");  //1''2
//		stk.push("Mango"); 	//2//1
		
	//	System.out.println(stk.search("Apple"));
//		System.out.println("Offset Position is : " + stk.indexOf("Grapes")); //1			
//		System.out.println("Offser Position is : " + stk.search("Banana")); //-1
//	    System.out.println("Is stack empty ? "+stk.empty());	//false
//		
//		System.out.println("Index Position is : " + stk.indexOf("Mango")); //2
	
		
	/*boolean []arr = new boolean[5];
	
	Set<Object> set = new HashSet<>();
	arr[0] = set.add(12);
	arr[1]  = set.add(13);
	arr[2] = set.add("ravi");
	arr[3] = set.add(12);
	arr[4] = set.add(new String("NIT"));
	System.out.println(Arrays.toString(arr));*/
		
		
		//LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

		/*linkedHashSet.add(10);
		linkedHashSet.add(5);
		linkedHashSet.add(15);
		linkedHashSet.add(20);
		linkedHashSet.add(5);
		System.out.println(linkedHashSet);*/
		
		
		/*	int a = 65;
			
			String b = "65";
			char c = 65;
			System.out.println(c);*/
		
      
//		HashMap hm3 = new HashMap();
//		hm3.put("A", 1);
//		hm3.put("A", 2);
//		hm3.put(new String("A"), 3);
//		hm3.put(65, 4);
//		System.out.println("Size is :"+hm3.size());
//		System.out.println(hm3);

		/*Integer a = 65;
		String b = "65";
		
		System.out.println(b.equals(a));*/
		
		
		/*Map<String,String> map = new HashMap<>();
		   map.put("Ravi", "12345");  
		   map.put("Rahul", "12345");
		   map.put("Aswin", "5678");
		   map.put(null, "6390");
		   map.put("Ravi","1529");
		   map.put("Aamir","890");
		
		   //System.out.println(map); 
		
		System.out.println(map.get(null));  
		   System.out.println(map.get("Virat"));  
		   
		   //map.forEach((k,v)-> System.out.println("Key is :"+k+" value is "+v)); 
		
		*/
		
		
		
		/*HashMap<Integer,String> hm = new HashMap<>();			 
		hm.put(1, "JSE");  
		hm.put(2, "JEE");
		hm.put(3, "JME"); 
		hm.put(4,"JavaFX");
		hm.put(5,null);
		hm.put(6,null);*/
		
		/*System.out.println("Initial map elements: " + hm); 
		System.out.println("key 2 is present or not :"+hm.containsKey(2));   
		
		System.out.println("JME is present or not :"+hm.containsValue("JME")); 
		
		System.out.println("Size of Map : " + hm.size()); 
		hm.clear(); 	
		System.out.println("Map elements after clear: " + hm);
		*/
		
		/*String string = hm.get(1);
		System.out.println(string);*/
		
		
		/*Map<String,String> map = new HashMap<>(9, 0.85f);
		map.put("key", "value");
		map.put("key2", "value2");
		map.put("key3", "value3");
		  map.put("key7","value7");
		
		
		   Set keys = map.keySet();//keySet return type is Set
		   System.out.println(keys ); //[]
		
		Collection val = map.values(); //values return type is collection
		System.out.println(val);
		
		  map.forEach((k,v)-> System.out.println(k+" : "+v));
		
		*/
		
		
		
		
		/*HashMap<Integer, String> hm1 = new HashMap<>();
		
		hm1.put(1, "Ravi");
		hm1.put(2, "Rahul");
		hm1.put(3, "Rajen");
		
		HashMap<Integer, String> hm2	= new HashMap<>(hm1);
		
		System.out.println("Mapping of HashMap hm1 are : "	+ hm1);
		
		System.out.println("Mapping of HashMap hm2 are : " + hm2);
		*/
		
		/*LinkedHashMap<Integer,String> l = new LinkedHashMap<>();
		l.put(1,"abc");
		l.put(3,"xyz");
		l.put(2,"pqr");
		l.put(4,"def");
		l.put(null,"ghi");
		System.out.println(l);*/
		
		/*	ArrayList al = new ArrayList(); //raw type
			al.add("Ravi");
			al.add("Ajay");
			al.add("Vijay");
								
			for(int i=0; i<al.size(); i++)
			{
			String name = (String) al.get(i); //type casting is required
			System.out.println(name.toUpperCase());
			}	
			*/
		
		
		
//		ArrayList<Car> a = new ArrayList<>();
//		RetrienAll retrienAll = new RetrienAll();
//		a.add(retrienAll.new Car());
//		a.add(retrienAll.new Car());
//	    a.add(retrienAll.new Car());
//
//		ArrayList b = a;  //assigning Generic to raw type 	          
//		b.forEach(System.out::println);   
		
		

		/*Object []obj = new String[3]; //valid with Array
		obj[0] = "Ravi";
		obj[1] = "hyd";
		obj[2] =  90; //java.lang.ArrayStoreException
		System.out.println(Arrays.toString(obj));
		
		*/
		
		
		

		
		
//		ArrayList<?> lp = new ArrayList<Child>();
//
//		ArrayList<Parent> lp1 = new ArrayList<Parent>(); 
//
//		ArrayList<Child> lp2 = new ArrayList<Parent>(); 
//		ArrayList<? super Child> lp3 = new ArrayList<Parent>(); 
//
//		System.out.println("Success");

		List<? extends Parent> lp = new ArrayList<Child>(); 
		System.out.println("Wild card....");
		System.out.println(lp);
		//lp.addAll(new Child());
		//lp.addAll(new Child());
		
		
		


	}  

class Parent
{
}
class Child extends Parent
{
}

}
