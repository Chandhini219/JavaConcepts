package Programs;

public class ConstructorOverloading {

	ConstructorOverloading(int age)
	{
		System.out.println("Age is " +age);
	}
	
	ConstructorOverloading(String name, String City)
	{
		System.out.println("My Name is " +name+ " And City is");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading obj=new ConstructorOverloading(24);
		ConstructorOverloading obj1=new ConstructorOverloading("Chandhini","Coimbatore");

	}

}
