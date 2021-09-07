package Thread_Programs;

public class ExtendsThread extends Thread {
	 void show() {
		System.out.println("I am ExtendsThread Class Mathod");
	}
	 public void run() {
		 System.out.println("Making fresh cakes --> "
					+Thread.currentThread().getId()+"-- >"
					+ Thread.currentThread().getName());
	 }
}
