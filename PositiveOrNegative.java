//Q.1 WAJP to get a number from the user and print whether it is positive or negative.

import java.util.Scanner;
public class PositiveOrNegative {

	public static void main(String[] args) {
		
		int n;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a number = ");
		n=obj.nextInt();
		if(n>0) {
			System.out.println(n+"  is positive");
		}
		else if(n<0) {
			System.out.println(n+"  is negative");
		}
		else {
			System.out.println(n+" is neither negative nor positive ");
		}


	}

}
