package Programs;

class Demo1 // One base class and One derived class.
{ 
    public void print_geek() 
    { 
        System.out.println("Happy"); 
    } 
} 
  
class Demo2 extends Demo1
{ 
    public void print_for() 
    { 
        System.out.println("Day"); 
    } 
} 

public class SingleInheritance {

	public static void main(String[] args) {
		Demo2 g = new Demo2(); 
        g.print_geek(); 
        g.print_for(); 
        g.print_geek(); 

	}

}
