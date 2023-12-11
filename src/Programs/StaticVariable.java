package Programs;

public class StaticVariable {

	static int accountbalance=0;
	String DepositBy;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVariable obj1=new StaticVariable();
		obj1.accountbalance=1000;
		obj1.DepositBy="Riya";
		
		
		StaticVariable obj2=new StaticVariable();
		obj2.accountbalance=2000;
		obj2.DepositBy="Diya";
		
		//Static variables shared among objects.Last value as updated as "2000"
		
		System.out.println("The Account Balance is " +obj1.accountbalance);  
		System.out.println("The Name is" +obj1.DepositBy);
		System.out.println("The Account Balance is " +obj2.accountbalance);  
		System.out.println("The Name is" +obj2.DepositBy);
	}

}
