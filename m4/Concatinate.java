import java.util.Scanner;
public class Concatinate {
	public static void main(String[] args) {
		System.out.println("Enter your name : ");
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		String b = ("Hello ");
		System.out.println(b + a + "!");
	}
}