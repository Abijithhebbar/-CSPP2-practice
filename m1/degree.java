import java.util.Scanner;
public class degree
{
	public static void main(String args[])
	{
	
	double d;
	
	System.out.println("Enter the degree celsius");
	Scanner in = new Scanner(System.in);
	int f = in.nextInt();
	if (f == 0)
	{
		System.out.println("the temperature in fareheit is 32");
	}
	else if (f > 0)
	{
		
		d = f * 1.8;
		d = d + 32;
		System.out.println("The temperature in fareheit is "+d);
	}
	else if (f < 0)
	{
		f = -f;
		// System.out.println(f);
		d = f * 1.8;
		// System.out.println(d);
		d = 32 - d;
		System.out.println("The temperature in fareheit is "+d);
	}
	}
}