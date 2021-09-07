package Clone_Enum_Generic_Runneble;

public class ImplementsRunnable implements Runnable {
	Thread t;
	public ImplementsRunnable() {
		System.out.println("I am ImplementsRunnable ctor");
		t=new Thread(this,"etc");
	}
	public void run() {
		System.out.println("I am ImplementsRunnable Run methods ");
	}
}


class RunnableDemo implements Runnable{
	Thread t2;
	public RunnableDemo(String a) {
		t2=new Thread(this,a);
		System.out.println("This is RunnableDemo cotr name = "+a);
	}
	
	public void run() {
		System.out.println("This is RunnableDemo Run methods name = "+t2.getName());
	}
	
}