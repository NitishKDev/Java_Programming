public class Factorial{
	public static void main(String []args)
	{
		int f=1,n=1;
		while(n<=10)
		{
			System.out.println(n+" ! = "+(f=f*n++));
		}
	}
}
			