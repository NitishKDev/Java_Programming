public class Excep7OTDC{
	public static void main(String []args){
	int bal=7000;
	int wamt=9000;
	if(bal<wamt)
		throw new ArithmeticException("insufficient balanace"); 
	bal=bal-wamt;
	System.out.println("transaction successfully completed");
	System.out.println("program continue");

	}
}
/*
Exception in thread "main" java.lang.ArithmeticException: insufficient balanace
        at Excep7OTDC.main(Excep7OTDC.java:6)
*/