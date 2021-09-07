package Buffer_Programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedInputStreamDemo1 {

	public static void main(String[] args) throws IOException {
		BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the char");
		char c=(char) b1.read();
		System.out.println(c);
		System.out.println("enter the no:");
		int a=(int)b1.read();
		System.out.println((int)a);
		
		char c1;
		System.out.println("press q to quit else ...");
		do {
			 c1=(char)b1.read();
			System.out.println(c1);
		}while(c1 !='q');
		
		String s;
		System.out.println("press exit to exit else ...");
		do {
			s=b1.readLine();
			System.out.println(s);
		}while(!s.equals("exit"));
		
		String s1[]=new String[100];
		System.out.println("Enter the Strings ");
		System.out.println("press 'Stop' to exit ");
		for(int i=0;i<100;i++) {
			s1[i]=b1.readLine();
			if(s1[i].equals("Stop")) break;
		}
		System.out.println("\nYour file is:");
		for(int i=0;i<100;i++) {
			if(s1[i].equals("Stop"))break;
			System.out.println(s1[i]);
		}
		
		
	}

}

/*
 OutPut :
 
 Enter the char
a
a
enter the no:
13
press q to quit else ...


e
e




f
f




q
q
press exit to exit else ...

demo
demo
local
local
structure
structure
exit
exit
Enter the Strings 
press 'Stop' to exit 
i am student
jspm clg of wagholi
hello world 123
stop
Stop

Your file is:
i am student
jspm clg of wagholi
hello world 123
stop

 
 */