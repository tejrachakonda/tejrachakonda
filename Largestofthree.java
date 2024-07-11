import java.io.*;
class Largestofthree
{
	public static void main(String args[])
	{
		int a=4,b=5,c=3,largest;
		largest=((a>b)&&(a>c))?a:((b>c)?b:c);
		System.out.println(largest);
	}
}
		