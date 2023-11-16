public class Excep8OTOC{
	public static void main(String []args){
	int bal=7000;
	int wamt=9000;
	try
	{
	if(bal<wamt)
	throw new ArithmeticException("insufficient balanace"); 
	bal=bal-wamt;
	System.out.println("transaction successfully completed");
	}
	catch(ArithmeticException ee)
	{
	System.out.println("exception :"+ee.getMessage());

	}
	System.out.println("program continue");

	}
}

/*
exception :insufficient balanace
program continue


why we should throw exception objct??
to set diffrnt messgae
becoz java cannot recognize exceptional situation of business logic
*/