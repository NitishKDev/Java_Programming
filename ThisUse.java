class Pen{
	String color;
	String type;
	public void write()
	{
		System.out.println("writing something");
	}
	public void printcolor()
	{
		System.out.println(this.color);
		System.out.println(this.type);
	}
}
public class ThisUse{
	public static void main(String []args)
	{
		Pen p1=new Pen();
		p1.write();
		p1.color="black";
		p1.type="ball";
		p1.printcolor();
		
		Pen p2=new Pen();
		p1.write();
		p2.color="red";
		p2.type="gel";
		p2.printcolor();
	}
}
/*
output
ThisUsage>javac ThisUse.java
\ThisUsage>java ThisUse
writing something
black
ball
writing something
red
gel
*/