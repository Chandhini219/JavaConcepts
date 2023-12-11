package Programs;

public class ParameterisedConstructor {
	
	String Animal;
	String Type;
	
	public ParameterisedConstructor(String Animal_name,String Animal_Type) {
		
		Animal=Animal_name;
		Type=Animal_Type;
		}
	
	public void sayAboutAnimals()
	{
		System.out.println("The Animal name is "+Animal+ " And the Type is "+Type);
	}
	
	public static void main(String[] args) {
		
		ParameterisedConstructor obj1=new ParameterisedConstructor("Duck", "Omniorous");
		obj1.sayAboutAnimals();
		ParameterisedConstructor obj2=new ParameterisedConstructor("Cat", "Omniorouss");
		obj2.sayAboutAnimals();
	}

}
