public class ExampleWrapper{
	public static void main(String []args)
	{
		Integer i1=Integer.valueOf("123");
		Integer i2=Integer.valueOf("110",2);
		Double d1=Double.valueOf("34.55");
		int a=Integer.parseInt("22");
		double d=Double.parseDouble("33.55");
		int c=i1.intValue();
		int k=i2.intValue();
		System.out.println(c + k);//129
	}
}