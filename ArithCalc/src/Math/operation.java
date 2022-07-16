
package Math;

import java.util.Scanner;

public class operation {

	public static void main(String[] args) {
		
		//Getting operator
		char operator;
		Scanner op= new Scanner(System.in);
		System.out.println("What operation do you want to be performed?"+"\n"+"(+,-,*,/)");
		operator= op.next().charAt(0);
		
		//Getting operands
		double a,b;
		System.out.println("Type in the operands.");
		a=op.nextDouble();
		b=op.nextDouble();
		
		
		//Performing Operation
		switch(operator) {
		case '+':
			System.out.printf("%.2f + %.2f = %.2f", a,b,(a+b));
			break;
		case '-':
			System.out.printf("%.2f - %.2f = %.2f", a,b,(a-b));
			break;
		case '*':
			System.out.printf("%.2f * %.2f = %.2f", a,b,(a*b));
			break;
		case '/':
			if(b!=0)
			System.out.printf("%.2f / %.2f = %.2f", a,b,(a/b));
			else 
			System.out.println("Math ERROR");
			break;
		
		default:
			System.out.printf("%a is not a valid operator",operator);
		}		
		
	}

}
