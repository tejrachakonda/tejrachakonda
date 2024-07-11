import java.io.*;
class PallindromeT
{
	public static void main(String args[])
	{
		int n=243;
		String s;
		s=(n%10==n/100)?"Pallindrome":"Not a Pallindrome";
		System.out.println(s);
	}
}
		