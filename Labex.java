import java.io.*;
class Labex
{
	public static void main(String args[])
	{
		int a=12,b=13,c=11;
		
		a=a++ + --b + c++;
		b=b++ + ++a*2;
		c=c++ + a++*(++b);
		b=b++ + ++b + c++ + ++a;
		b=b+(--c + ++c + a++ + b++);
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("b="+b);
		System.out.println("b="+b);
	}
}