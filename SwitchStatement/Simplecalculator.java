import java.util.*;
class Simplecalculator
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,add,sub,mul,div,mod;
		char choice;

		System.out.println("------SIMPLE CALCULATOR--------");
		System.out.println("+"+"Addition");
		System.out.println("-"+"Substraction");
		System.out.println("*"+"Multiplication");
		System.out.println("/"+"Division");
		System.out.println("%"+"Modulas");

		System.out.println("Enter a and b");
		a=sc.nextInt();
		b=sc.nextInt();

		System.out.println("enter the choice");
		choice=sc.next().charAt(0);

		switch(choice)
		{
			case '+':add=a+b;
				System.out.println("Add of a and b="+add);
				break;
			case '-':sub=a-b;
				System.out.println("sub of a and b"+sub);
				break;
			case '*':mul=a*b;
				System.out.println("Mul of a and b"+mul);
				break;
			case '/':div=a/b;
				System.out.println("div of a and b"+div);
				break;
			case '%':mod=a%b;
				System.out.println("mod of a and b"+mod);
				break;
			default: System.out.println("Error");
		}
	}
}
		

