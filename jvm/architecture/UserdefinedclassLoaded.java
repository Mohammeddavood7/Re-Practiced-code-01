package jvm.architecture;

public class UserdefinedclassLoaded {

	public static void main(String[] args) 
	{
 
		ClassLoader loader = UserdefinedclassLoaded.class.getClassLoader();
		System.out.println(loader);
		
		ClassLoader load = UserdefinedclassLoaded.class.getClassLoader();
		ClassLoader parent = load.getParent();
		System.out.println(parent.getParent());
	}

}
