package Programs;
/* Method:
---Without body.
---Cannot static.
Class:
---Class has one or more abstract method it consider as abstract class.
---we cannot create object for abstract class.
----Abstract class have abstract method or non-abstract method.
----We inhert abstract class to access the abstract class members.
 */

	
			abstract class Shape
			{  
				abstract void draw();  
			}  
				
			class Rectangle extends Shape
			{  
				void draw()
				{
					System.out.println("drawing rectangle");
			
				}  
			}
				class Circle1 extends Shape 
				{  
				void draw()
				{ 
					System.out.println("drawing circle");
				}  
				}  
				
				public class abstractClass  {
				public static void main(String args[]){  
				Shape s=new Circle1();  
				s.draw();  
				}  
				}  


