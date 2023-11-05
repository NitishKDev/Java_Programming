public class ExceptionZero{
	public static void main(String []args)
	{
		try{
		int a=2,b=0;
			System.out.println("Quotient "+(a/b));
		}
		catch(ArithmeticException e)
		{
			System.out.println("Number can't be divided by zero");
		}
	}
}
		
