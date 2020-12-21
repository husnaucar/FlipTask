package exceptions;

public class UncheckedException {

	public static void main(String[] args) {
		
		int a = 12;
		int b = 0;
	try {
		System.out.println(a/b);
	}
	catch(ArithmeticException e) {
		System.out.println("You can not divide by zero");
		
		
	}
	finally{
		System.out.println(e.getMessage());
	}
				
			
		
	

	}
}

//Other Unchecked Exceptions are
//	ArithmeticException, ArrayIndexOutOfBoundsException,
//	NullPointerException, NumberFormatException, IllegalArgumentException
//	ClassCastException
