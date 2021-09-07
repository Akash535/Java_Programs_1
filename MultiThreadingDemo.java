package Thread_Programs;

public class MultiThreadingDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		System.out.println("id = "+Thread.currentThread().getId());
		System.out.println("name = "+Thread.currentThread().getName());
		System.out.println("1st Priority = "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		System.out.println("2nd Priority = "+Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getContextClassLoader());
	}
}
