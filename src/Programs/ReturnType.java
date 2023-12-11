package Programs;

public class ReturnType {
	
	int amount=1000;
	
	public int amountFun()
	{
		System.out.println("Get the amount "+amount+" from the shop");
		return amount;
	}

	public static void main(String[] args) {
		
		ReturnType obj=new ReturnType();
		int values=obj.amountFun();
		System.out.println("Thankyou for bringing the amount "+values);
		

	}

}
