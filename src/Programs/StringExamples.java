package Programs;

public class StringExamples {
public static void main(String[] args) {
		
		String name1=" Chandhini "; //Creating by literals.It does not create separate memory
		String name2="Chandhini";
		int age=21;
		String s=new String("Chandhini");//Creating by new Keyword. Creates Separate Memory
		
		//Character value for particular Element
		System.out.println(s.charAt(3));
		
		//Getting index value
		System.out.println(s.indexOf("d"));
		
		//return String length
		System.out.println(s.length());
		
		//Equality of given string object
		System.out.println(s.equals("chandhu"));
		
		//Equality of given string object in case sensitivity
		System.out.println(s.equalsIgnoreCase("CHANDHINI"));
		
		//Check it is empty
		System.out.println(s.isEmpty());
		
		//Returns true or false when given value is present or not
		System.out.println(s.contains("h"));
		
		//Take a particular portion
		System.out.println(s.substring(3)); //----It takes from 3rd Index.
		
		//Take a particular portion from starts and ends
		System.out.println(s.substring(1, 6));
		
		//Append the string.
		System.out.println(s.concat("nilla"));
		
		//Replace the exisiting string
		System.out.println(s.replace("h", "*"));
		System.out.println(s.replace("Cha", "***"));
		
		//Trim-----Deletes the beginning and ending white spaces
		System.out.println(name1);
		System.out.println(name1.trim());
		
		//Convert given datatype to string
		System.out.println(String.valueOf(age));
		
		//Convert to Lowercase.
		String i="CHANDHINI";
		System.out.println(i.toLowerCase());
		
		//Convert to uppercase.
		System.out.println(s.toUpperCase());
		
		//Join with given delimiters
		System.out.println(String.join("-","Kit","Kat"));
		System.out.println(String.join("/","13","09","1992"));
		System.out.println(String.join("/","21","04","1999"));
		
		//split
		String split="How,are,you";
		String[] value=split.split(",");
		for (String string : value) {
			System.out.println(string);
		}
		
		//Character specified from index position
		System.out.println(s.indexOf("h",0 ));
		System.out.println(s.indexOf("h",5 )); //chandhini
		System.out.println(s.indexOf("andh", 1));
		
}

}
