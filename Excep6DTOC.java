public class Excep6DTOC{
	public static void main(String []args){
		
		try
		{
			System.out.println(3/0);
			System.out.println("in try");

		}
		catch(NullPointerException n)//this catch will not match
		{
		System.out.println("exception" +n.getMessage());
		}
		//catch(ArithmeticException ee)//this catch will match
		//{
		//System.out.println("exception" +ee.getMessage());
		//}
		finally{
		System.out.println("bye");
		}
	}
}
/*
finally will always run whetehr exception occur or not
if all catch not match then aftr try finally run then default catch will run.
if no exception occur in try then catch not run but finally run...then y write finally??
if we waant some code to be executed
*/