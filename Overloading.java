class Student{
	String name;
	int age;
	public void printinfo(String name)
	{
		System.out.println(name);
	}
	
	public void printinfo(int age)
	{
		System.out.println(age);
	}
	public void printinfo(String name,int age)
	{
		System.out.println("name="+name +" and "+"age ="+age);
	}
}
public class Overloading{
	public static void main(String []args)
	{
		Student s1=new Student();
		s1.name="jack";
		s1.age=34;
		s1.printinfo(s1.name);//compile time polymorphism..compiler detect for any error during compiling only
		s1.printinfo(s1.age);
		s1.printinfo(s1.name,s1.age);
	}
}
/*output

jack
34
name=jack and age =34

*/