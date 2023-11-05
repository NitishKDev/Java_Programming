class Student{
	String name;
	int age;
	public void printinfo()
	{
		System.out.println("info are:");
		System.out.println(this.name);
		System.out.println(this.age);
		
	}
	Student()
	{
		System.out.println("non parametrized constructor called");
	}
	
	Student(String name,int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("parametrized constructor called");
		System.out.println(this.name);
		System.out.println(this.age);
	}
	Student(Student s2)
	{
		System.out.println("copy constructor");
		this.name=s2.name;
		this.age=s2.age;
	}
	
}
public class ThisUse2{
	public static void main(String []args)
	{
		Student s1=new Student();
		s1.name="jack";
		s1.age=22;
		s1.printinfo();
		
		Student s2=new Student("frost",23);
		
		Student s3=new Student(s2);//copy constructor..assign objct into another object..used to make copy of object
		s3.printinfo();//no need to write destructor..automatically..garbage collector
	}
}
/*
output....

non parametrized constructor called
info are:
jack
22
parametrized constructor called
frost
23
copy constructor
info are:
frost
23
*/