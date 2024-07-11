import java.util.*;
class Ratioif
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		float a,b,ratio,temp;

		System.out.println("enter values of a and b");
		a=sc.nextFloat();
		b=sc.nextFloat();

		
		System.out.println("Before swap="+a+" "+b);

		ratio=a/b;

		if(ratio>0)
		{
			temp=a;
			a=b;
			b=temp;
		}
			System.out.println("After swap="+a+" "+b);
	}
}