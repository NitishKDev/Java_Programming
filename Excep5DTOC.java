public class Excep5DTOC{
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
		catch(ArithmeticException ee)//this catch will match
		{
		System.out.println("exception" +ee.getMessage());
		}
		System.out.println("bye");

	}
}
/*when all catch not match then java default catch will run n java will end the progarm.
*/