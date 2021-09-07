package Recursion_Programs;

 class multi {
	public int mult(int a,int b) {
	int m=0;
	if(b==0)
		return 0;
	else
	
		m=mult(a,b-1)+a;
	return m;
	}

}
public class Multiply {

	
	public static void main(String[] args) {
  multi x=new multi();
  System.out.println("multiplication is "+x.mult(10, 50));


	}

}
