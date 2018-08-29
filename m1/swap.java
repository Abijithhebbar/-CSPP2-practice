public class swap
{
	public static void main(String args[])
	{
		int a, b, c;
		a = 10;
		b = 20;
		System.out.println("original values of a , b are");
		System.out.println(a);
		System.out.println(b);
		c = b;
		b = a;
		a = c;
		System.out.println("Swapped values of a, b are");
		System.out.println(a);
		System.out.println(b);


	}
}