import java.util.*;
class Swapingoftwo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a,b,temp;

		System.out.println("enter a and b");

		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Before Swap="+a+" "+b);

		temp=a;
		a=b;
		b=temp;

		System.out.println("after swap="+a+" "+b);
	}
}