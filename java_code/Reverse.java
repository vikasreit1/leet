import java.io.*;
import javax.swing.*;
 
class Reverse
{
	public static void main(String args[])
	{
	String s1;
	StringBuffer s2;
	s1=JOptionPane.showInputDialog("Enter the number: ");
	StringBuffer buf=new StringBuffer(s1);
    s2=buf.reverse( );
   JOptionPane.showMessageDialog(null, s2);
}
}