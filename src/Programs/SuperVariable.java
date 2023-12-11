package Programs;


class Vehicle 
{ 
    int maxSpeed = 120; 
} 
  

class Car extends Vehicle 
{ 
    int maxSpeed = 180; 
  
    void display() 
    { 
        /* print maxSpeed of base class (vehicle) */
        System.out.println("Maximum Speed: " + super.maxSpeed); 
        System.out.println("Maximum Speed: " + maxSpeed); 
    } 
} 
  
public class SuperVariable {

	public static void main(String[] args) 
	{
        Car small = new Car(); 
        small.display(); 
    } 
} 






