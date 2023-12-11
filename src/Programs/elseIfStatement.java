package Programs;

public class elseIfStatement {
	
	String name="Angel";

	public static void main(String[] args) {
	elseIfStatement obj=new elseIfStatement();
	
	if(obj.name=="Anu")
	{
		System.out.println("No..You're wrong");
	}
	else if (obj.name=="Ani")
	{
		System.out.println("No..You're wrong");
	}
	else if(obj.name=="Angel")
	{
		System.out.println("No...You're wrong");
	}
	else
	{
		System.out.println("Try Again");
	}
	}

}
