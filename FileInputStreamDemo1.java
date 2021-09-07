package Buffer_Programs;

import java.io.*;
public class FileInputStreamDemo1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fin=new FileInputStream("C:\\Users\\reliance\\OneDrive\\Desktop\\javaee\\Demo1\\src\\Practice\\Akash.txt");
		int i;
		do {
			i=fin.read();
			if(i!=-1);
			System.out.print((char)i);
		}while(i!=-1);
		fin.close();
		
		
	}

}
