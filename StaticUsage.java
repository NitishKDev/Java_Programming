/*
Static keywoord:::
which is commom to whole class
static methds(fuction),nested class,varible(properties),block...all are accesd by class name
memory:anything which is static got memory only once WHEREAS object got memry again n again..
       wanna save memory n have some common information then make them static.
*/
class Student{
	String name;
	static String college;// for all objects the college name willbe same
	public static void cngecoll()
	{
		college="RV";
	}
}
public class StaticUsage{
	public static void main(String []args)
	{
		Student.college="AIT";
		Student s1=new Student();
		s1.name="jack";
		System.out.println("college= "+s1.college);
	}
}
