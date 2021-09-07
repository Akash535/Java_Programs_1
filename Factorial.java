package Recursion_Programs;

class Fact{
	int fact(int a) {
		int f = 1 ;
		if(a==0)
			return 1;
		else 
			f=a*fact(a-1);
//		for(int i=1;i<=a;i++) {
//			f=a*fact(a-1);
//		}
		return f;
	}
}
public class Factorial {

	public static void main(String[] args) {
		
		Fact f=new Fact();
		//f.fact(5);
		System.out.println("Factorial is "+f.fact(5));
		
	}

}
