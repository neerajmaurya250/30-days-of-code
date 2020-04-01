package Day_1;
import java.util.Scanner;
public class SalaryBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double YOS;
		int salary;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Year of Service: ");
		YOS = sc.nextDouble();
		
		if(YOS>5) {
			System.out.print("Enter Base Salary = ");
			salary = sc.nextInt();
			double bonus = 0.05*salary;
			System.out.print("Bonus Amount = "+bonus);
		}
		else
			System.out.print("No Bobus for You.");
		
		sc.close();

	}

}
