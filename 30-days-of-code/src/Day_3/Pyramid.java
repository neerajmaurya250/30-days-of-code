package Day_3;
import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Rows in Pyramid : ");
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=2*n-1; j++) {
				
				if(j>=n-(i-1) && j<=n+(i-1) ) {
					
					System.out.print("*");
					
				}else
					System.out.print(" ");
				
			}
			System.out.println();
		}

	}

}
