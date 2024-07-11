import java.io.*;
class Studentdetails
{
	public static void main(String args[]) throws IOException
	{
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int rollno;
		String name;
		char gender;
		String branch;
		int semester;
		float marks;
	
		System.out.println("rollno=");
		rollno=Integer.parseInt(br.readLine());

		System.out.println("name=");
		name=br.readLine();

		System.out.println("gender=");
		gender=(char)br.read();

		br.skip(2);

		System.out.println("branch=");
		branch=br.readLine();

		System.out.println("semester=");
		semester=Integer.parseInt(br.readLine());

		
		System.out.println("marks=");
		marks=Float.parseFloat(br.readLine());

		System.out.println(rollno);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(semester);
		System.out.println(marks);
	}
}
		
		
	
		