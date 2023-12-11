package Programs;


	/* It is like a class but it have abstract methods and cinstants variables.
	All methods should be public,static,abstract.
	Variable are public,static,final. */


			interface In1 
			{ 
			    
			    final int a = 10;   
			    void display(); 
			} 
			public class Interface implements In1 // we can inherit two or more classes / Inheritance.
			{ 
			    public void display() 
			    { 
			        System.out.println("Software Testing..."); 
			    } 
			    public static void main (String[] args) 
			    { 
			        Interface t = new Interface(); 
			        t.display(); 
			        System.out.println(a); 
			    } 
			} 

