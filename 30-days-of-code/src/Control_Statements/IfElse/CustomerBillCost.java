package Control_Statements.IfElse;

import java.util.Scanner;

public class CustomerBillCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int unit;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of units: ");
		unit = sc.nextInt();
		if(unit>=10) {
			int amount = unit*100;
			int discount = (amount*10)/100;
			int cost = amount - discount;
			
			System.out.print("Total Payable = "+cost+"\n");
			System.out.print("Discount = "+discount);
			
		}
		else {
			int cost = unit*100;
			System.out.print("Total Payable = "+cost+"\n");
			System.out.print("Discount = 0");
		}
		sc.close();
		

	}

}
