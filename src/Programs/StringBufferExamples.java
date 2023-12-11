package Programs;

public class StringBufferExamples {

	public static void main(String[] args) {
		 
		StringBuffer s=new StringBuffer("chandhini"); // Creating only new Keyword.
		//Reverse
		System.out.println(s.reverse());
		
		//Replace
		StringBuffer s1=new StringBuffer("chandhini");
		System.out.println(s1.replace(0, 4, "saban"));
		
		//delete
		StringBuffer s2=new StringBuffer("chandhini");
		System.out.println(s2.delete(0, 4));
		
		//Insert
		StringBuffer s3=new StringBuffer("chandhini");
		System.out.println(s3.insert(9, "nilla"));
		
		//Capacity
		StringBuffer s4=new StringBuffer("chandhini");
		System.out.println(s4.capacity());

	}

}
