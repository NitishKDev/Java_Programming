import java.util.Scanner;
public class PrimeNot{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number for checking prime");
		int n=sc.nextInt();
		int flag=0;
		int m=n/2;
		if(n!=0&&n!=1&&n>1)
		{
			for(int i=2;i<=m;i++)
			{
				if(n%i==0)
				{
				flag=1;
				break;
				}
			}
		}
		else
		{
			flag=1;
		}
		if(flag==1)
			System.out.println("not prime");
		else
			System.out.println("prime");
	}
}