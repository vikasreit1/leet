import java.io.*;

class Reverse1
{
  public static void main(String args[]) throws IOException
	{
	   int rem;
	  BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
	  System.out.println("Enter the number: ");
      int num = Integer.parseInt(s.readLine());
      int n=num;
	  int newnum=0;
	  for(int i=0; i<=num; i++)
		{
		  rem=num%10;
		  num=num/10;
		  newnum = newnum*10 + rem;
		  i=0;
		}
		System.out.println("Reversed number is: " + newnum);
	}
}



