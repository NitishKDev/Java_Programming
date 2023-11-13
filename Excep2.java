public class Excep2{
	public static void main(String []args)
	{
		String name;
		System.out.println("yoo first line");
		System.out.println("String length is "+name.length());//error
		System.out.println("yoo..im not printed");

	}
}
/*compile time error..no exception.
name is reference variable..local..it is not object.
local varibale is not initialised so it is blank.
we try to use blank varible so it is compile time error.
*/