package Programs;


	class one // One base class more derived class
	{ 
	    public void print1() 
	    { 
	        System.out.println("Good Morning"); 
	    } 
	} 
	  
	class two extends one 
	{ 
	    public void print2() 
	    { 
	        System.out.println("Have a Good Day"); 
	    } 
	} 
	  
	class three extends one 
	{ 
	    /*............*/
	} 
	  
	public class Hierarchical {

	    public static void main(String[] args) 
	    { 
	        three g = new three(); 
	        g.print1(); 
	        two t = new two(); 
	        t.print2(); 
	        g.print1(); 
	    } 
	} 

