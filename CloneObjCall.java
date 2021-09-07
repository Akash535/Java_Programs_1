package Clone_Enum_Generic_Runneble;

//import java.lang.ref.Cleaner.Cleanable;

class Data implements Cloneable {
	public void show(){
		System.out.println("Inside the Data Class");
	}
	protected Object  clone() {
		System.out.println("Object Clone");
		try {
			System.out.println("Inside the try");
			throw new CloneNotSupportedException();
			//return super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Inside Catch");
			//e.printStackTrace();
		}
		System.out.println("Outside the try");
		return 0;
	}
}

public class CloneObjCall {
	public static  void main(String a[]) {
		Data d1=new Data();
		d1.show();
		System.out.println("I am main\n");
		
		try {
			Data d2=(Data) d1.clone();
			System.out.println("Before throw");
			throw new Exception();
		}
		catch(Exception e) {
			System.out.println("I am main Catch\n\n");
			
		}
//		Data d3=(Data) d1.clone();
//		d3.clone();
	}
}
