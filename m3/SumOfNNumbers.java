import java.util.Scanner;
public class SumOfNNumbers
{
	public static void main(String[] args) {
		int n,j = 0;
		System.out.println("Enter the number");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		for (int i = 1; i<=n; i++)
		{
			j = j + i;
		}

		System.out.println(j);

	}
}