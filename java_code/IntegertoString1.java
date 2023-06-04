import java.io.*;
import java.lang.*;

public class IntegertoString1
{
  public static void main (String args[ ]) throws IOException
{
BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the Integer value: ");
String str = read.readLine();
String s= new Integer(str).toString();
System.out.println("String: " + s);
}
}
