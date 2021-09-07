package Clone_Enum_Generic_Runneble;

class Generic<T>{
	T t;
	Generic(T t){
		this.t=t;
	}
	public T getT() {
		return t;
	}
	@Override
	public String toString() {
		return "Generic [t=" + t + "]";
	}
	
}

public class GenericsDemo1 {

	public static void main(String[] args) {
		Generic d1=new Generic(121);
		d1.getT();
		System.out.println(d1);
	}

}
