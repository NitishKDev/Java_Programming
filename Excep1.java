public class Excep1{
	public static void main(String []args)
	{
		System.out.println("yoo first line");
		System.out.println("rsult "+4/0);
		System.out.println("yoo..im not printed");//not print

	}
}
/*no compile time error..code is fine...4/0 is not error
4/0..exception occr..java automatically created object of class(ArithmeticException) and throw it
default catch mechanism of java got calld which print one error message to describe situation
then program ends there only
*/