package Programs;

public class finalExample {
	/*
	 ---Variable-- Value cannot re-assigned (Constant).
	 ---Method-- It is not over-ridden.
	 ---Class-- Cannot Inherited.
	 

	*/
				//final int capacity = 4; //-----------------Cannot make static reference to the non-static capacity.
				public static void main(String[] args) 
				{
					final int capacity = 1999;
					// re-assigning final variable 
			        // will throw compile-time error
					// capacity = 5; //------------------- //we cannot assign another value for different value at same variable.
					System.out.println(capacity);
				}
			}
					      
				


