package Day_1;
import java.util.Scanner;
public class SquareOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double length,bredth;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length of the Ractangle: ");
		length = sc.nextDouble();
		System.out.print("Enter Bredth of the Ractangle: ");
		bredth = sc.nextDouble();
		if(length==bredth) {
			System.out.print("This is a Square.");
		}
		else
			System.out.print("This is not a Square.");
		sc.close();

	}

}
