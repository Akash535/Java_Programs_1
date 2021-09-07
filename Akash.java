package Interface_Extends_Implements;

public class Akash extends Student implements Marks {
	public void studentMarks() {
		System.out.println("Akash Marks is 88.14 %");
	}
	public void avgCGPA(double a,double b) {
		System.out.println("Avg of Akash CGPA is "+(a+b)/2);
	}
}
