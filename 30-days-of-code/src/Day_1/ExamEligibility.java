package Day_1;
import java.util.Scanner;

public class ExamEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double c,a;
		
		//c => No. of classes held
		//a => No. of classes attended
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No. of total classes held : ");
		c = sc.nextDouble();
		System.out.print("Enter No. of classes attended : ");
		a = sc.nextDouble();
		double attendence = a/(c*0.01);
		if(attendence>=75) {
			System.out.print("Candidate is eligible.\n");
			System.out.print("Attendence Perccentage = "+attendence);

		}
		else {
			System.out.print("Candidate not eligible\n");

			System.out.print("Attendence Perccentage = "+attendence);

		}
		sc.close();

	}

}
