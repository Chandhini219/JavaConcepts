package Programs;

public class ThisKeywordConstructor {
	String Animal; // Refers to this Animal
	String Type; //Refers to this Type
	
	public ThisKeywordConstructor(String Animal_name,String Animal_Type) {
		
		this.Animal=Animal_name;
		this.Type=Animal_Type;
		}
	
	public void sayAboutAnimals()
	{
		System.out.println("The Animal name is "+Animal+ " And the Type is "+Type);
	}
	
	public static void main(String[] args) {
		
		ThisKeywordConstructor obj1=new ThisKeywordConstructor("Duck", "Omniorous");
		obj1.sayAboutAnimals();
		ThisKeywordConstructor obj2=new ThisKeywordConstructor("Cat", "Omniorouss");
		obj2.sayAboutAnimals();
	}

	}


