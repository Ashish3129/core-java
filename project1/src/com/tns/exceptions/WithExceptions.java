
package com.tns.exceptions;

import java.util.InputMismatchException;

public class WithExceptions {

	
	public static void divide() {
		int a=6, b=0,c;
		try { //exception is raised
		c=a/b;
		
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception Caught"+e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println("Exception Caught"+e.getMessage());

		}
		catch(ArithmeticException e) { //exception is handled
			System.out.println("Exception Caught"+e.getMessage());

			
		}
		
 catch(Exception e) { 
	System.out.println("Exception Caught"+e.getMessage());
}
finally {
	System.out.println("this will be excecuted");
	
}
			
			
		}
		
}