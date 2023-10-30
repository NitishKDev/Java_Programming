class Sta{
	int x;//instance variable
	static int y;//static member variable
	public void fun1()//instance member function
	{
		System.out.println("x= "+ x);
	}
	public static void fun2()//static member function
	{
	y=9;
	System.out.println("y= "+y);
	}
	static class Test//static inner class
	{
		public static String cnt="india";
}
}
public class ExampleStatic{
public static void main(String []args){
Sta.fun2();
Sta.y=8	;
System.out.println("y= "+Sta.y);
System.out.println("country= "+Sta.Test.cnt);
}
}

	