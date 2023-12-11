package Programs;


	class Test {
		   private String name;
		   private String idNum;
		   private int age;

		   public int getAge() {
		      return age;
		   }

		   public String getName() {
		      return name;
		   }

		   public String getIdNum() {
		      return idNum;
		   }

		   public void setAge( int newAge) {
		      age = newAge;
		   }

		   public void setName(String newName) {
		      name = newName;
		   }

		   public void setIdNum( String newId) {
		      idNum = newId;
		   }
		}
	public class Encapsulation {

		public static void main(String[] args)
	{
			Test encap = new Test();
		      encap.setName("Chandhini");
		      encap.setAge(21);
		      encap.setIdNum("2104");

		      System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());
			

		}
}
