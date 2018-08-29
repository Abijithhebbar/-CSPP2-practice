import java.util.Scanner;
public class AreaOfCircle
{
	public static void main(String[] args)
	{
		/*double area, pi = 3.14, radius;
		*Scanner scan = new Scanner(System.in);
		*radius = scan .nextDouble();
		*area = pi*(radius*radius);
		*System.out.println(area);
		*/
		Scanner in = new Scanner(System.in);
		double r = in .nextDouble();
		System.out.println(area(r));
		
	}
	public static double pi(){
		return 3.14;
	}
	public static double area(double r){
		double area = pi()*r*r;
		return area;
	}
}
