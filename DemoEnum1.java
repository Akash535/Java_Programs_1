package Clone_Enum_Generic_Runneble;

enum Apple{
	jonathan(10),goldendel(9),reddel(11),winsap(15);
	private int price;
	 Apple(int n) {
		 price=n;
	 }
	 int getPrice() {
		 return price;
	 }
}

enum Months{
	jan,feb,march,april,may,jun,jul,agu,sept,oct,nov,dec;
}

public class DemoEnum1 {

	public static void main(String[] args) {
		Apple a1;
		//Apple a2[]=Apple.values();
		for(Apple i:Apple.values()) {
			System.out.println(i.getPrice()+"-->"+i);
		}
		System.out.println(Apple.goldendel.name()+"-->"+Apple.goldendel.getPrice());
		
		System.out.println("--------------------------");
		Months m1;
		Months m2[]=Months.values();
		for(Months i:m2) {
			System.out.println(i);
		}
		m1=Months.valueOf("nov");
		System.out.println(m1+"-->"+m1.getClass());
	}

}
