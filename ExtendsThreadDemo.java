package Thread_Programs;

import java.util.concurrent.TimeUnit;

public class ExtendsThreadDemo {

	public static void main(String[] args) {
		System.out.println("main class start");
		
		ExtendsThread t1=new ExtendsThread();
		t1.start();
		t1.show();

		try {
			TimeUnit.SECONDS.sleep(1);
		}
		catch(Exception e) {
			
		}
		ExtendsThread t2=new ExtendsThread();
		t2.start();
		System.out.println("main class end");
	}

}
