package Programs;

public class Exception1 {
	/* Try----It checks every line if it is exception it creates an obj and throw it to catch statement.
	 * Catch--It contains only reference (ArithmeticException e) if the obj matches to the reference, catch clause will executed.
	 * Throws---Automatically create an obj.
	            We can give number of exception classes in method signature.
	 * Throw----Manually we create an obj (i.e) user defined exception.
	            we can give only one exception class obj in method definition.
	 */


		public static void main(String[] args) {
				   try{  
				      //code that may raise exception  
				      int data=100/0;  
				      System.out.println("-----------");  // It will not executed because it stops from the above line.
				   }
				   catch(ArithmeticException e){ 
					   System.out.println(e);
					   }  
				   finally
				   {
				   System.out.println("Finally Block Executed");  // Finally block executes even the try and catch block executes or not.
				  }  
				   System.out.println("Rest of the code");
				} 
	}


