package Interface_Extends_Implements;

public class Sachin extends Student implements Marks{
	public void studentMarks() {
		System.out.println("Sachin Marks is 89.15 %");
	}
	public void avgCGPA(double a,double b) {
		System.out.println("Avg of Sachin CGPA is "+(a+b)/2);
	}
}
