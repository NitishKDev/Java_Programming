public class Excep4DTOC{
	public static void main(String []args){
		
		try
		{
			System.out.println(3/0);//java create ArithmeticExceptionclass object n throw
			System.out.println("in try");//not run..so write dependent line only..which depend on previos line

		}
		catch(ArithmeticException ee)//our catch catch the objct...either java catch or our catch
		{
		System.out.println("exception" +ee.getMessage());
		}
		System.out.println("bye");//this will print since program not end

	}
}
/*
after try either catch or finally blcok is mandatory.
write both thn first we write catch then finally.
we can write many catch but finally one only.
we can create many times try catch block in our program but one catch or finally is compulsory with try.

put tht code in try where exception will occur.

in catch write NullPointerException..then our catch not catch..java catch will run n program end.
program will not end only when our catch will execute.

output:

exception/ by zero
bye
*/
