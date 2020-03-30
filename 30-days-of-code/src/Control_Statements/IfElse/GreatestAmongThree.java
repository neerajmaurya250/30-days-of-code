package Control_Statements.IfElse;
import java.util.Scanner;

public class GreatestAmongThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Three numbers\n");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		if(a>b)
			{
			if(a>c)
				System.out.print("Greatest Number is "+a);
			else
				System.out.print("Greatest Number is "+c);
			}
		else if(b>c)
			System.out.print("Greatest Number is "+b);
		else
			System.out.print("Greatest Number is "+c);
		
		sc.close();
		

	}

}
