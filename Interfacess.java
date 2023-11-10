/* second type of abstrction which uses interfaces
defined by interface keyword
pure abstraction(hide all useless info..show only useful)
same as class but they have some fixed proprty
interface cannot have constuctor (abstract class can have)
intefce dont contain non abtsrtt methds..neither its implementation.
intefaces are implemented..not extends
property::
>all fields(varibles) are by default public,static and final.
>all methods are public and abstract by default.
>a class tht implemets a interface must implements all the methods declared in inteface.
>inteface support th functionality of multiple inhertance.

*/
interface Animal{
	int eyes=2;//static(cant be chnged..for all animal its same),final(value r fixed),public(accessbale for all).
	public void walk();
	//Animal();error
	/*void eats()
	{
		......error
	}*/
}
class Cat implements Animal{
	public void walk()
	{
		System.out.println("walk on 4 legs");
	}
}
public class Interfacess{
	public static void main(String []args)
	{
		Cat c1=new Cat();
		c1.walk();
	}
}
	