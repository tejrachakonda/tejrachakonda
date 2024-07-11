import java.util.*;
class Simpleintrest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int p,t;
		float r,SI;
		
		
		System.out.println("enter p,t and r");
		
		p=sc.nextInt();
		t=sc.nextInt();
		r=sc.nextFloat();

		SI=p*t*r/100;

		System.out.println("Simple intreat="+SI);
	}
}