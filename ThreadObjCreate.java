package Thread_Programs;

import java.util.concurrent.TimeUnit;

public class ThreadObjCreate {

	public static void main(String[] args) {
		Thread t1=new Thread();
		System.out.println(t1.getName());
		Thread t2=new Thread(t1);
		System.out.println(t2.getName());
		Runnable r1=new Runnable() {
			public void run() {}	};
		Runnable r2=new Thread();
		for(int i=1;i<=10;i++) {
			try {
				TimeUnit.SECONDS.sleep(1);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

}
