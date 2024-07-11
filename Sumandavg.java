import java.util.*;
class Sumandavg
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a,b,c,sum;
		float avg;
	
		System.out.println("enter a,b and c");		

		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();

		sum=a+b+c;
		avg=sum/2.0f;

		System.out.println("sum of three="+sum);
		System.out.println("avg of three="+avg);
	}
}
		
	