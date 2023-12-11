package Programs;

public class methodOveridding2 extends methodOveriding1 {

	public void marriage()
	{
		System.out.println("My Rules");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       methodOveriding1 obj=new methodOveridding2();
       obj.properties();
       obj.marriage(); 
		
		
	}

}
