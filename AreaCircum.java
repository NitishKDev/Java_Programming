import java.util.Scanner;
public class AreaCircum{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius of circle");
		double r=sc.nextDouble();
		System.out.println("area is "+(Math.PI*r*r));
		System.out.println("Circumference is "+(2*Math.PI*r));
	}
}
		