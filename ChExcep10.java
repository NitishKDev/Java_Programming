/*
if we do this by using throws then tht will only avoid
compile tim error..default catch run then program end.
actual exception is handled by using try catch only
*/
import java.io.*;
public class ChExcep10{
	public static void main(String []args)
	{
		try
		{
		 throw new IOException();    
		//System.out.println("helo");
		}
		catch(IOException e)
		{
			System.out.println("Exception" +e.getMessage());
		}
	}
}
/*

*/