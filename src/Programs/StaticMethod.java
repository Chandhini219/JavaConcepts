package Programs;

public class StaticMethod {
	
	public static void funOne()
	{
		// funsec(); we cannot use non-static method into -static method
		System.out.println("Static Methods");
	}
	
	public void funSec()
	{
		funOne(); // Can access from Static to Non-static Method.
		System.out.println("Non-static Methods");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		funOne();
	//	funSec(); Cannot use method name because it is not a static method
     StaticMethod obj=new StaticMethod();
     obj.funSec();
	}

}
