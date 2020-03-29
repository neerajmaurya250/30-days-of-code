package Control_Statements;
import java.util.Scanner;

public class MaximumBetweenTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Two numbers:\n");
		a = sc.nextDouble();
		b = sc.nextDouble();

		if(a>b) {
			System.out.print("Maximum number is "+a);
		}
		else if(b>a) {
			System.out.print("Maximum number is "+b);
		}
		else {
			System.out.print("Numbers are equal.");
		}
		sc.close();

	}
 
}
