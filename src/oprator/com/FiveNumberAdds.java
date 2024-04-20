package oprator.com;

import java.util.Scanner;

public class FiveNumberAdds{
 

//	public static void main(String[] args) {
		 public static void main(String[] args) {

int n=0,s=0;

for (int i=0;i<5;i++) {
	System.out.println("Input the 5 numbers : ");
	Scanner in = new Scanner(System.in);
    n = in.nextInt();
    s+=n;  
      
}
System.out.println(s);


    }
}
