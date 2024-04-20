package collection;

public class CostomExceptionDemo1 {
	public static void main(String[] args) {
	int	age=10;
	if(age>20) {
		 throw new TooOldException("Your age already crossed marriage age!");
    }else if(age>18) {
        throw new TooYungException("Please wait for some more time!");
    }else {
    	System.out.println("You will get match details by mail!");
        }


	}
		
		
	}


