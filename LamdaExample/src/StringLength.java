
import java.util.Scanner;
public class StringLength {
public static void main(String args[])
{
	System.out.println("Enter a string:");
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	A a=(s)->
	{
		int len=s.length();
		System.out.println("Length of the String is: "+len);
	};
	a.length(s1);
}
}

interface A
{
	void length(String s);
}