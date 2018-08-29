import java.util.Scanner;
public class Pattern
{
	public static void main(String[] args) {
		int n, i = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for the pattern");
		n = sc.nextInt();
		while (i<=n)
		{
			
			for(int j = 1;j<=i; j++)
			{
				System.out.print(j+" ");
				// System.out.println("\n");
			}
			i++;
			System.out.println(" ");
		}
		


		}
	}
