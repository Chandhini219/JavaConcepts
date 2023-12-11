package Programs;

public class StaticBlock {
	static
	{
		System.out.println("Block Code-1");
	}
	
	static
	{
		System.out.println("Block Code-2");     // Static Code executes first before the main function
	}

	public static void main(String[] args) {
	StaticBlock obj=new StaticBlock();
	System.out.println("Block Code-3");
	}

}
