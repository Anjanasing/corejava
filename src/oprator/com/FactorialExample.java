package oprator.com;

public class FactorialExample {

	public static void main(String[] args) {
		int number=6;
		int factorial=1;
		for (int i=1;i<=number;i++) {
			factorial=factorial*i;
			
		}
		
		System.out.println("Factorial of "+number+" is: "+factorial);
		
	}

}
