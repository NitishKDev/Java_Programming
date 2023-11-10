/*constructor chaining..means chain of constructr get called when we try to create object in inheritance.
when we create a object of derived class then first parent class constuctor get calld then child class
*/
abstract class Animal{     
	abstract void walk();   
		Animal()
		{
			System.out.println("Creating new animal");
		}

			
	public void eats()       
	{
		System.out.println("they eats");
	}
}
class Horse extends Animal{
	Horse()
	{
		System.out.println("ceating new horse");
	}
		
	public void walk()
	{
		System.out.println("walk on four legS");
	}
}
class chicken extends Animal{
	public void walk()
	{
		System.out.println("walk on two legS");
	}
}
public class Constructor_chaining{
	public static void main(String []args)
	{
		Horse h1= new Horse();
	
	}
}
 /*
 Creating new animal
ceating new horse
*/