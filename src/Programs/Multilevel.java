package Programs;

	class One1
	{ 
	    public void print1() 
	    { 
	        System.out.println("Chandhini"); 
	    } 
	} 
	  
	class Two2  extends One1 
	{ 
	    public void print2() 
	    { 
	        System.out.println("Nithyasree"); 
	    } 
	} 
	  
	class Three3 extends Two2 
	{ 
	    public void print3() 
	    { 
	        System.out.println("Keerthana"); 
	    } 
	} 
	  
	
	public class Multilevel {
	
	    public static void main(String[] args) 
	    { 
	        Three3 g = new Three3(); 
	        g.print1(); 
	        g.print2(); 
	        g.print3(); 
	    } 
	} 

