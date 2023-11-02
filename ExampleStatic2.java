class Account{
	float bal;
	int accno;
	static float rateofint;
	public void fun1(float b,int a)
	{
		bal=b;
		accno=a;
		System.out.println("balance= "+bal+"\naccount no= "+accno);
	}
	public static void fun2()
	{
		rateofint=7.8f;
		System.out.println("rate of interest is =" +rateofint);
	}
}
public class ExampleStatic2{
	public static void main(String []args)
	{
		Account a1=new Account();
		a1.fun1(34.87f,6320011);
		Account.fun2();
	}
}
	
