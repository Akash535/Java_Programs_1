package Buffer_Programs;


import java.io.*;

public class TryWithResourcesDemo1 {

	public static void main(String[] args) throws IOException {
		System.out.println("----------------FileInputStream------------------");
		try(FileInputStream fin1=new FileInputStream("C:\\Users\\reliance\\OneDrive\\Desktop\\javaee\\Demo1\\src\\Practice\\Akash.txt")){
			int s= fin1.read();
			System.out.println("Print 1st char Ascii value of File = "+s);
		}
		
		System.out.println("-----------------BufferedReader-----------------");
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
			System.out.println("Enter the String :");
			String s=br.readLine();
			System.out.println("String is = "+s);
		}
		
		System.out.println("------FileInputStream-------------BufferedReader---------------");
		try(FileInputStream fin1=new FileInputStream("C:\\Users\\reliance\\OneDrive\\Desktop\\javaee\\Demo1\\src\\Practice\\Akash.txt");
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
		{
			int i;
			do {
				i=fin1.read();
				if(i!=-1)
					System.out.print((char)i);
			}while(i!=-1);
			
			System.out.println("\nEnter the char");
			char c=(char) br.read();
			System.out.println(c);
		}
	}

}
