import java.util.*;
class Fttemp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		
		float ct,ft;
		
		System.out.println("enter ft");
		ft=sc.nextFloat();
	
		ct=(ft-32.0f)*5/9.0f;

		System.out.println("celcious="+ct);
	}
}