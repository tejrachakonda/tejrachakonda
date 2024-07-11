import java.util.*;
class Temparature
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		float ct,ft,kt,it;
		char choice;

		System.out.println("*****Temerature calculator*****");
		System.out.println("F:"+"Ft");
		System.out.println("C:"+"ct");
		System.out.println("K:"+"Kt");

		System.out.println("enter initial temp");
		it=sc.nextFloat();

		System.out.println("enter choice");
		choice=sc.next().charAt(0);

		switch(choice)
		{
		case 'F': ft=it;
			  ct=(ft-32.0f)*5/9;
			  kt=ct+273.03f;
		System.out.println("celcious temp="+ct);
		System.out.println("Farehneit temp="+ft);
		System.out.println("Kelvin temp="+kt);
		break;
		
		case 'C': ct=it;
			  ft=(ct*9)/5+32.0f;
			  kt=ct+273.03f;
		System.out.println("celcious temp="+ct);
		System.out.println("Farehneit temp="+ft);
		System.out.println("Kelvin temp="+kt);
		break;

		case 'K': kt=it;
			  ct=kt-273.03f;
			  ft=(ct*9)/5+32.0f;
		System.out.println("celcious temp="+ct);
		System.out.println("Farehneit temp="+ft);
		System.out.println("Kelvin temp="+kt);
		break;
		default: System.out.println("error");
		}
	}
}
			  

		

		