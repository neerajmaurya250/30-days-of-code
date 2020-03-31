package Java_Loop;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double n,sum=0;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.print("Enter no.");
			n = sc.nextDouble();
			sum = sum+n;
		}
		System.out.print("Average = "+sum/10);

	}

}
