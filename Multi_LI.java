class shape{            //parent class/base class/super class
	public void area()
	{
		System.out.println("display area");
	}
}
class Triangle extends shape{           //subclass/child class/
	public void area(double l,double b)
	{
		System.out.println(0.5*l*b);
	}
}
class Equi extends Triangle{
	public void area(double l,double b)
	{
		System.out.println(0.5*l*b);
	}
}

public class Multi_LI{
	public static void main(String []args)
	{
		Triangle t=new Triangle();
		t.area(3.0,4.0);
	
		Equi t2=new Equi();
		t2.area(7.0,4.0);
	}
}
