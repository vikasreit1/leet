import java.io.*;

class Degrees1
{
	public static void main(String args[]) throws IOException
	{
converter dg = new converter();
dg.fahrenheit_to_celsius();
dg.celsius_to_fahrenheit();
	}
}
	class converter
	{
	  public void fahrenheit_to_celsius() throws IOException
		{
	  BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
	  System.out.println("Enter the fahrenheit temperature: ");
      int f = Integer.parseInt(s.readLine());
     	  
		double c = ((f - 32.0)/9.0)*5.0;
		 
		System.out.println("The temp in celsius is " + c);
	}

	public void celsius_to_fahrenheit()  throws IOException
	{
	  BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
	  System.out.println("Enter the fahrenheit temperature: ");
      int c = Integer.parseInt(s.readLine());
     	  
		double f = ((9.0 / 5) * c) + 32;
		 
		System.out.println("The temp in fahrenheit is " + f);
	}
	}



