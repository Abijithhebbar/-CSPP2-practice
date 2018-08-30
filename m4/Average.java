import java.util.*;
public class Average {
	public static void main(String[] args) {
		int arr[];
		double avg = 0, sum = 0;
		System.out.println("please enter the array size");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		arr = new int[size];
		System.out.println("Please enter the array elements");
		for (int i = 0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i<size; i++) {
			sum = sum + arr[i];
			}
		avg = sum/ size;
		System.out.println("Average of the given string is:"+avg);
	}
}