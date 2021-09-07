package Clone_Enum_Generic_Runneble;

import java.util.concurrent.TimeUnit;

public class ImplementsRunnableDemo {

	public static void main(String[] args) {
		System.out.println("main class start");
		
		ImplementsRunnable t1=new ImplementsRunnable();
		t1.t.start();
		

		try {
			TimeUnit.SECONDS.sleep(1);
		}
		catch(Exception e) {
			
		}
		
		System.out.println("\n");
		RunnableDemo r1=new RunnableDemo("Akash");
		RunnableDemo r2=new RunnableDemo("Omkar");
		RunnableDemo r3=new RunnableDemo("Ajay");
		try {
			TimeUnit.SECONDS.sleep(1);
		}
		catch(Exception e) {
			
		}
		r1.t2.start();
		r2.t2.start();
		r3.t2.start();
		try {
			TimeUnit.SECONDS.sleep(1);
		}
		catch(Exception e) {
			
		}
		System.out.println("\n");
		System.out.println("main class end");
	}

}
