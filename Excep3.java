public class Excep3{
	public static void main(String []args)
	{
		String name=null;
		System.out.println("yoo first line");
		System.out.println("String length is "+name.length());//no compile time error...exception
		System.out.println("yoo..im not printed");

	}
}
/*
null means not assigned any string
name is not pointing to any string objrct..it has null
name.length() is wrong..coz name not pointing to any string...length() is illegal.
so when any reference varible not refering to any objct n we try to call the method of that objct 
whcich run only when object exist..then in tht situation NullPointerException arises.

java create objct of NullPointerException n throw it..catch by default catch mechanism..msg printed.progm end.
*/
