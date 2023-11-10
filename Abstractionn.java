/*abstract means just some concept..no need to be implemented.
Abstraction can be achieved in two ways:1)usng abstract class kywd 2)using interface(pure abstraction).
an abtract classs created using abstract keyword
it can have abstract  and non abstact methods
it cannot be instantiated.
can have constuctor and static method also.

*/
abstract class Animal{        //cant create object coz animal is only concept..only blueprint..cant actually created
	abstract void walk();    // cant create body
	public void eats()       //non abtrct method
	{
		System.out.println("they eats");
	}
}
class Horse extends Animal{
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
public class Abstractionn{
	public static void main(String []args)
	{
		Horse h1= new Horse();
		h1.walk();
		h1.eats();
		
		//Animal a1=new Animal();   Animal is abstract; cannot be instantiated
		//a1.walk();
	}
}
/*output
walk on four legS
they eats
*/