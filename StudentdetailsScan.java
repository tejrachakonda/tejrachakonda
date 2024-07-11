import java.util.*;
class StudentdetailsScan
{
	public static void main(String args[]) 
	{
	        Scanner sc= new Scanner(System.in);
		int rollno;
		String name;
		char gender;
		String branch;
		int semester;
		float marks;
	
		System.out.println("rollno=");
		rollno=sc.nextInt();
		sc.nextLine();

		System.out.println("name=");
		name=sc.nextLine();

		System.out.println("gender=");
		gender=sc.next().charAt(0);
		sc.nextLine();

		

		System.out.println("branch=");
		branch=sc.nextLine();

		System.out.println("semester=");
		semester=sc.nextInt();

		
		System.out.println("marks=");
		marks=sc.nextFloat();

		System.out.println(rollno);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(semester);
		System.out.println(marks);
	}
}
		
		
	
		