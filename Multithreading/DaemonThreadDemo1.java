package Multithreading;

/*class MyThread extends Thread
{
	public void run()
	{
		Thread name = Thread.currentThread();
		name.setName("child");
		String name2 = name.getName();
		
		for(int i = 0 ; i <= 5 ; i++)
		{
			System.out.println(name2);
		}
	}
}

public class Thread0Thread1
{
	public static void main(String[] args) 
	{
		System.out.println("main thread is started");
		
		MyThread thread = new MyThread();
		thread.start();
		
		
		 Thread thread2 = Thread.currentThread();
		 thread2.setName("Parent");
		 
		 String name = thread2.getName();
		
		for(int i = 0 ; i < 5 ; i++)
		{
			System.out.println(name);
		}
		
		int i = 0;
		do
		{
			System.out.println("do while");
			i++;
		}while(i < 5);
		
		System.out.println("main thread is ended");

		
		
	}

}*/


/*class MyTest extends Thread 
{	
	
	@Override
	public void run() 
	{		
		for (int i = 1; i <= 5; i++) 
		{			      
			  try 
			  {				  
				  Thread.sleep(1000); //child1
			  }
			  catch(Exception e) 
			  {
			   System.err.println("thread has interrupted"); 
			  }
			 	
			System.out.println(i + " by " + Thread.currentThread().getName());
		}
	}
}
public class SleepDemo1 
{
	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().getName() + " thread");

		MyTest t1 = new MyTest();
		MyTest t2 = new MyTest();

		t1.setName("Child1");
		t2.setName("Child2");
		
		t1.start();
		t2.start();	
		
	}
}*/



/*class UserThread implements Runnable
{
	@Override
	public void run() 
	{
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		System.out.println(t.getId());
	}	
}

public class RunnableDemo 
{
	public static void main(String[] args) 
	{
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		System.out.println(t.getId());
		
		Thread tn = new Thread(new UserThread(),"Child1");
		
		tn.start();
		
				
		Thread t1 = new Thread(new Ravi(),"Ravi");
		t1.start();

		Thread t2 = new Thread(new Rahul(),"Rahul");
		t2.start();
	}

}

class Ravi implements Runnable
{

	@Override
	public void run() 
	{
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		System.out.println(t.getId());
		
	}
	
}

class Rahul implements Runnable
{
	@Override
	public void run() 
	{
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		System.out.println(t.getId());
		
	}
	
}*/

/*public class ThreadWithLambda {

	public static void main(String[] args) throws InterruptedException
	{
	new Thread(()-> 
	{
		for(int i=1; i<=100; i=i+2)
		{
		String name = Thread.currentThread().getName();
			System.out.println(i+" by "+name);
		}

	},"Thread1").start();
	
	Thread.sleep(1000);
	System.out.println("............");
	new Thread(()-> 
	{
		for(int i=2; i<=100; i=i+2)
		{
		String name = Thread.currentThread().getName();
			System.out.println(i+" by "+name);
		}	

	},"Thread2").start();
  }
}*/



/*class Customer implements Runnable
{
    private int availableSeat = 1;
    private int wantedSeat;
    
    public Customer(int wantedSeat)
    {
    	this.wantedSeat = wantedSeat;
    }
    
	@Override
	public void run() 
	{
		String name = null;
	    
		//t1   t2
		
		if(availableSeat >= wantedSeat)
		{
			name = Thread.currentThread().getName();
			System.out.println(wantedSeat + " seat booked for :"+name);
			availableSeat = availableSeat - wantedSeat;
		}
		else
		{
			name = Thread.currentThread().getName();
			System.err.println("Sorry "+name+" seat is not available");
		}			
	}	
}

public class ThreadWithLambda {

	
	public static void main(String[] args) 
	{
		Customer c1 = new Customer(1);
		
		Thread t1 = new Thread(c1, "Person1");
		Thread t2 = new Thread(c1, "Person2");
		
		t1.start();  t2.start();
		
		

	}

}*/




/*class MyThread implements Runnable
{
	private String str;
	
	public MyThread(String str)
	{
		this.str=str;
	}	
	
	@Override
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(str+ " : "+i);
			try
			{
				Thread.sleep(100);
			}
			catch (Exception e)
			{
			System.err.println(e);
			}
		}
	}
}
public class Theatre
{
	public static void main(String [] args)
	{
		MyThread obj1 = new MyThread("sell the Ticket");  
		MyThread obj2 = new MyThread("Allocate the Seat"); 

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		t2.start();
	}
}*/



/*class MyThread implements Runnable
{

	
	public static synchronized void mTable(int num)
	{
		
		for(int i = 1 ; i <= 10 ; i++)
		{
		   System.out.println(num+" * "+i+" = "+(num*i));	
		   
		   try 
		   {
			Thread.sleep(1000);
		   } 
		   catch (InterruptedException e) 
		   {
			e.printStackTrace();
		   }
		}
		
	}
	
	
	@Override
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		MyThread.mTable(sc.nextInt());
		
	}
	
}
public class MyThreadMain
{
	public static void main(String[] args)
	{
		MyThread t = new MyThread();
		MyThread tt = new MyThread();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(tt);
		Thread t4 = new Thread(tt);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();

		
	}
}*/


/*class Bank 
{
  int balance = 10000;
    
  public synchronized void withdraw(int amount)
  {
	  
	  if(balance < amount)
	  {
		  System.err.println("insufficent balance please make deposit and withdraw");
		  try 
		  {
			wait();
		  }
		  catch (InterruptedException e)
		  {
			e.printStackTrace();
		  }
	  }
	  System.out.println("amount withdraw successfully "+amount);
	  balance -= amount;
	  System.out.println("remaining amount is  "+balance);
	  
	  
	  
	  
  }
  public synchronized void deposit(int amount)
  {
	  balance += amount;
	  notify(); 
  }
	
	
}

public class BankMain
{
	public static void main(String[] args)
	{
		Bank b = new Bank();
		Runnable r1 = ()-> {b.withdraw(20000);};
		Runnable r2 = ()-> {b.deposit(30000);};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();

			
		
	}
	
}*/



/*class Resource 
{
    private boolean flag = false;

    public synchronized void waitMethod() 
	{
		System.out.println("Wait");
       	while (!flag) 
		{
          try 
		  {
             System.out.println(Thread.currentThread().getName() + " is waiting...");
             wait(); 
          } 
		  catch (InterruptedException e) 
		  {
                e.printStackTrace();
          }
        }
        System.out.println(Thread.currentThread().getName() + " thread completed!!");
    }

    public synchronized void setMethod() 
	{
		System.out.println("notifyAll");
		this.flag = true;
        System.out.println(Thread.currentThread().getName() + " has make flag value as a true");
        notifyAll(); // Notify all waiting threads that the signal is set
    }
}

public class InterThreadNotifyAll
{
    public static void main(String[] args) 
		{
        Resource r1 = new Resource();

        Thread t1 = new Thread(() -> r1.waitMethod(), "Child1");
        Thread t2 = new Thread(() -> r1.waitMethod(), "Child2");
	Thread t3 = new Thread(() -> r1.waitMethod(), "Child3");
		
	Thread setter = new Thread(() -> r1.setMethod(), "Setter_Thread");

        t1.start();
        t2.start();
        t3.start();
       
	     
        try 
		{
            Thread.sleep(2000);
        } 
		catch (InterruptedException e) 
		{
            e.printStackTrace();
        }


        setter.start();
    }
}*/

/*public class MainPriority 
{
	public static void main(String[] args) 
	{
		Thread t = Thread.currentThread();
				
		System.out.println(t.getPriority());
		
		Thread t1 = new Thread();
		System.out.println(t1.getPriority());
	}

}*/



/*class ThreadP extends Thread
{
	@Override
	public void run()
	{
	  int priority = Thread.currentThread().getPriority(); 
	  
	  System.out.println("Child Thread priority is :"+priority);  	  
	}
}
public class MainPriority1 
{
	public static void main(String[] args) 
	{
		Thread t = Thread.currentThread();
		t.setPriority(8);
		
		//t.setPriority(11); Invalid java.lang.IllegalArgumentException 
		
		System.out.println("Main thread priority is :"+t.getPriority()); 		
		
		ThreadP t1 = new ThreadP();
		t1.start();		
	}
}*/


/*public class ThreadPrior1 extends Thread
{
	@Override
	public void run()   
	{	
		int count = 0; 
		
		for(int i=1; i<=1000000; i++)
		{
		  count++;	
		}
		
	System.out.println("Thread name is:"+Thread.currentThread().getName());
	System.out.println("Thread priority is:"+Thread.currentThread().getPriority());
	}	
	
	public static void main(String args[])
	{
		ThreadPrior1 m1 = new ThreadPrior1();
		ThreadPrior1 m2 = new ThreadPrior1();
		
		m1.setPriority(Thread.MIN_PRIORITY);//1
		m2.setPriority(Thread.MAX_PRIORITY);//10	
		
		m1.setName("Last");
		m2.setName("First");	
		
		m1.start();
		m2.start();
	}
} */



/*class Interrupt extends Thread
{
   @Override
   public void run()
	{
	   Thread t = Thread.currentThread();
	   System.out.println(t.isInterrupted()); 
       
	   for(int i=1; i<=10; i++)
		{
		   System.out.println(i);  
		   try
		   {
			Thread.sleep(1000);
		   }
		   catch (InterruptedException e)
		   {
			   System.err.println("Thread is Interrupted ");
			   e.printStackTrace();
		   }
		}
	}
}
public class  InterruptThread
{
	public static void main(String[] args) 
	{
		Interrupt it = new Interrupt();
		System.out.println(it.getState());  
		it.start();
		it.interrupt();  //main thread is interrupting the child thread
	}
}*/




/*class Interrupt extends Thread
{
   public void run()
	{
	   try
	   {
	    
		    Thread.currentThread().interrupt();


	   for(int i=1; i<=10; i++)
		{
		   System.out.println("i value is :"+i);
		   Thread.sleep(1000);
		}
		System.out.println(isInterrupted());

	   }
		catch (InterruptedException e)
		{
			System.err.println("Thread is Interrupted :"+e);
		}
		System.out.println("Child thread completed...");
	}
}
public class  InterruptThread
{
	public static void main(String[] args) 
	{
		System.out.println("Main thread is started");
		Interrupt it = new Interrupt();
		it.start();
		System.out.println("Main thread is ended");
	}
}*/


/*public class InterruptThread
{
    public static void main(String[] args) 
	{
        Thread thread = new Thread(new MyRunnable());
        thread.start();
     
        try 
		{
           Thread.sleep(3000);//main thread is waiting for 3 sec
        } 
		catch (InterruptedException e) 
		{
            e.printStackTrace();
        }
        
       thread.interrupt();  //child thread interrupted
    }
}

class MyRunnable implements Runnable 
{
    @Override
    public void run() 
	{
        try 
		{
            while (!Thread.currentThread().isInterrupted())
			{
                System.out.println("Thread is running...");
                Thread.sleep(500);
            }
        } 
		catch (InterruptedException e) 
		{
            System.err.println("Thread interrupted gracefully.");
        } 
		finally 
		{
            System.out.println("Thread resource can be release here.");
        }
    }
}
*/


/*public class ThreadGroupDemo1
{
   public static void main(String[] args) 
	{       
        ThreadGroup myThreadGroup = new ThreadGroup("NIT_Thread");

        // Create and start threads within the ThreadGroup

        Thread thread1 = new Thread(myThreadGroup, new MyRunnable(), "Thread 1");

        Thread thread2 = new Thread(myThreadGroup, new MyRunnable(), "Thread 2");

        Thread thread3 = new Thread(myThreadGroup, new MyRunnable(), "Thread 3");

		
      
        
        
        thread1.start();
        thread2.start();
        thread3.start();
		

        // Display information about the ThreadGroup and its threads
        System.out.println("ThreadGroup Name: " + myThreadGroup.getName());

        System.out.println("Active Count: " + myThreadGroup.activeCount());       
    }
}

class MyRunnable implements Runnable //static nested inner 
{
        @Override
        public void run() 
		{
            for (int i = 1; i <= 3; i++) 
			{
                System.out.println(Thread.currentThread().getName() + ": " + i);
                try 
				{
                    Thread.sleep(1000);
                } 
				catch (InterruptedException e) 
				{
                    e.printStackTrace();
                }
            }
        }
    }*/

public class DaemonThreadDemo1
{
  public static void main(String[] args) 
	{
	    System.out.println("Main Thread Started...");

        Thread daemonThread = new Thread(() -> 
		{
            while (true) 
			{
                System.out.println("Daemon Thread is running...");
                try 
				{
                    Thread.sleep(1000);
                } 
				catch (InterruptedException e) 
				{
                    e.printStackTrace();
                }
            }
        });

        daemonThread.setDaemon(true); 
        daemonThread.start();

        
        Thread userThread = new Thread(() -> 
		{
            for (int i = 1; i <= 9; i++) 
			{
                System.out.println("User Thread: " + i);
                try 
				{
                    Thread.sleep(2000);
                } 
				catch (InterruptedException e) 
				{
                    e.printStackTrace();
                }
            }
        });

        userThread.start();

        System.out.println("Main Thread Ended...");
    }
}













