import java.util.*;
class Geomatricalshapes
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		float area,r,side,length,breath,base,height;
		int figcode;
		
		System.out.println("------Geomatricalshapes-----");
		System.out.println("001:Area of circle");
		System.out.println("002:Area of square");
		System.out.println("003:Area of rectangle");
		System.out.println("004:Area of triangle");

		System.out.println("enter figcode");
		figcode=sc.nextInt();

		switch(figcode)
		{
			case 001:System.out.println("Enter radius of circle");
				r=sc.nextFloat();
				area=3.142f*r*r;
				System.out.println("area of circle is="+area);
				break;
			case 002:System.out.println("Enter side of square");
				side=sc.nextFloat();
				area=side*side;
				System.out.println("area of square is="+area);
				break;
			case 003:System.out.println("Enter length and breath of rectangle");
				length=sc.nextFloat();
				breath=sc.nextFloat();
				area=length*breath;
				System.out.println("area of reactangle is="+area);
				break;
			case 004:System.out.println("Enter base and height of triangle");
				base=sc.nextFloat();
				height=sc.nextFloat();
				area=0.5f*base*height;
				System.out.println("area of triangle is="+area);
				break;

			default: System.out.println("error");
		}
	}
}
					
				
