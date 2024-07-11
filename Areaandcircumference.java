import java.util.*;
class Areaandcircumference
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		float r,area,circumference;
	
		System.out.println("enter radius");		

		r=sc.nextFloat();
		area=3.142f*r*r;
		circumference=2*3.142f*r;
		
		System.out.println("area of circle="+area);
		System.out.println("circumference of circle="+circumference);
	}
}
		
	