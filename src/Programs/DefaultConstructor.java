package Programs;

public class DefaultConstructor {

	int age;
	String name;
	Integer RollNo;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultConstructor obj=new DefaultConstructor();
		System.out.println("Age is " +obj.age);
		System.out.println("Name is " +obj.name); // String is a Class, so we got Null.
		System.out.println("RollNo is" +obj.RollNo); // Integer is a Class , So we got Null

	}

}
