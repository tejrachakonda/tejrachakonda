import java.util.*;
class Equalornot
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a,b;

		System.out.println(" read a and b");
		a=sc.nextInt();
		b=sc.nextInt();

		if(a==b)
			System.out.println("equal");
		else
			System.out.println("not");
	}
}
			