 public class ExampleConstructor{
	private int l,b,h;
	public ExampleConstructor()
	{
		l=6;b=9;h=4;
		System.out.println(l+b+h);
	}
	public ExampleConstructor(int L,int B,int H)
	{
		l=L;b=B;h=H;
		System.out.println(l+b+h);

	}

	public static void main(String []args)
	{
		ExampleConstructor e1=new ExampleConstructor();
		ExampleConstructor e2=new ExampleConstructor(12,4,6);
	}
 }
