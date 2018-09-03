import java.util.Scanner;
class Student{
	public Student(String name,String rollno, Double subject1, Double subject2, Double subject3){
		String n = name;
		String r = rollno;
		Double score1 = subject1;
		Double score2 = subject2;
		Double score3 = subject3;
		System.out.println("average is" + ((score1+score2+score3)/3));
	}

}
public class StudentDetails{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		String rollnum = in.nextLine();
		Double s1 = in.nextDouble();
		Double s2 = in.nextDouble();
		Double s3 = in.nextDouble();
		Student st = new Student(name,rollnum,s1,s2,s3);
	}
}