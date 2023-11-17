/*
checked exception is compile time exxecption
cheked by compiler tht here exception will occur but
compiler didnt hadle it..it will get handle durring run time only
compiler will tell ki user handle it using try catch or
tell java to handle it.
so to tell java we use "throws" keyword.
we heve two choices..either we or java.


*/
import java.io.*;
public class ChExcep9{
	public static void main(String []args) throws IOException
	{
		throw new IOException();    //suppose some lines r there where this exception occred
		//System.out.println("helo");
	}
}
/*
since IOException is checked excception so error will come at compile time
beacoz we didnt handle it neither we tell java to do so


output

error: unreachable statement
System.out.println("helo");
 
 error: unreported exception IOException; must be caught or declared to be thrown
 throw new IOException();
 
 unreported means we didnt tell java....
 must be caught means either we do try catch...or declared to thorwn means tell java to throw
 
 
 here we told java to handle(throws IOException)..we handle it in part 2
 
 Exception in thread "main" java.io.IOException
        at ChExcep9.main(ChExcep9.java:16)
*/