/*
inteface support th functionality of multiple inhertance.

*/
interface Animal{
	int eyes=2;
	public void walk();
}
interface Herbivore{
	void eat();
}

class Cow implements Animal,Herbivore{
	public void walk()
	{
		System.out.println("walk on 4 legs");
	}
	public void eat()
	{
		System.out.println("eats grass");
	}

}
public class Multiple_inheri{
	public static void main(String []args)
	{
		Cow c1=new Cow();
		c1.walk();
		c1.eat();
	}
}
	