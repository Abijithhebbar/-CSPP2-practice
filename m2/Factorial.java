import java.util.Scanner;
public class Factorial
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		System.out.println(fact(num));

	}
	public static int fact(int num)
	{
		if (num==0 || num==1)
		{
			return 1;
		}
		else
		{
			return num*fact(num-1);
		}
	}
}