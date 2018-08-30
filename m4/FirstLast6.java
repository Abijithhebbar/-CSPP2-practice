import java.util.*;
public class FirstLast6 {
	public static void main(String[] args) {
		int arr[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of the array");
		int size = sc.nextInt();
		arr = new int[size];
		System.out.println("Please enter the array elements");
		for (int i = 0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		if (arr[0] == 6) {
			System.out.println(true);
		} else if (arr[size-1] == 6) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}
}