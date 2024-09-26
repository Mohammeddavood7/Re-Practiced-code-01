package Streams;

@FunctionalInterface
interface AA 
{
    Test createObject();
}

class Test 
{
    public Test() 
    {
        System.out.println("Test class Constructor invoked");
    }
}
public class ConstructorReferenceDemo1
{
    public static void main(String[] args) 
    {
        //By using Lambda
    	AA a1 = ()-> new Test();        
        a1.createObject(); 
        
        System.out.println("...................");        
        
       //By Using Method Reference
        AA a2 = Test::new;   //calling Test class constructor 
        a2.createObject(); 
    }
}
