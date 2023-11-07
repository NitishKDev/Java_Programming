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
class circle extends shape{
	public void area(double r)
	{
		System.out.println(3.14*r*r);
	}
}

public class Hierar{
	public static void main(String []args)
	{
		Triangle t=new Triangle();
		t.area(3.0,4.0);
	
		circle c= new circle();
		c.area(3.3);
	}
}
