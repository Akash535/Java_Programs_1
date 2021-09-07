package Interface_Extends_Implements;

public class MainStudent {

	public static void main(String[] args) {
		Student s=new Student();
		s.avgCGPA(1.1, 1.2);
		s=new Akash();
		s.studentMarks();
		s.avgCGPA(8.9, 7.4);
		
		s=new Vijay();
		s.studentMarks();
		
		Student s1=new Sachin();
		s1.studentMarks();
		
		s1=new Santosh();
		s1.studentMarks();
	}

}
/*
OutPut :

Avg of Sachin CGPA is 8.9
Akash Marks is 88.14 %
Avg of Akash CGPA is 8.15
Vijay Marks is 75.95 %
Sachin Marks is 89.15 %
Santosh Marks is 71.89 %


*/