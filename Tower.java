package Recursion_Programs;
class T{
	void tower(int n,char a,char b,char c) {
		if(n==1) {
			
			System.out.println(a+"------>"+c);
		}
		else {
			tower(n-1,a,b,c);
			System.out.println(a+"------>"+c);
			tower(n-1,b,c,a);
		}
	}
}
public class Tower {

	public static void main(String[] args) {
		T t=new T();
		t.tower(4,'A','C','B');

	}

}
