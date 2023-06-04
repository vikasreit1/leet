import java.io.*;
import java.lang.*;

class Trainee_related
{
	
	String empno, empname, age, batch_id, stream, mail_id;
	boolean isHungry, isSick;

	public void setdetails()
	{
		try
		{
			
		BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Employee no: ");
		empno = t.readLine();
		System.out.println("Enter the Employee name: ");
		empname = t.readLine();
		System.out.println("Enter the age of Employee:  ");
		age = t.readLine();
		System.out.println("Enter the Batch ID: ");
		batch_id = t.readLine();
		System.out.println("Enter the Stream: ");
		stream = t.readLine();
		System.out.println("Enter the E-mail ID: ");
		mail_id = t.readLine();
}	
	catch(Exception e)
	{
		System.out.println("XYz");
	}
}
    public void getdetails()
	{
		System.out.println("The Employee no is: " + empno);
        System.out.println("The name of the Employee: " + empname);
		System.out.println("The age of the Employee is: " + age);
        System.out.println("The Batch ID of the Employee is: " + batch_id);
		System.out.println("The stream of the Employee is: " + stream);
        System.out.println("E-mail ID of the  Employee is: " + mail_id);
	}
}

	class Trainee extends Trainee_related
	{
public static void main(String args[]) throws IOException
		{
	//Trainee_related t1 = new Trainee_related();
	Trainee t1=new Trainee();
	t1.setdetails();
	t1.getdetails();
	}
	}

