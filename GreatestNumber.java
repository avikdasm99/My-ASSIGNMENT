// Q.3 Take three numbers from the user and print the greatest number.

import java.util.Scanner;
public class GreatestNumber {

	public static void main(String[] args) {
		int a,b,c;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the First number = ");
		a=obj.nextInt();
		System.out.print("Enter the Second number = ");
		b=obj.nextInt();
		System.out.print("Enter the Third number = ");
		c=obj.nextInt();
		
		if(a>b && a>c) {
			System.out.println(a+" is greatest number  ");
		}
		else if(b>a && b>c) {
			System.out.println(b+" greatest number ");
		}
		else {
			System.out.println(c+" greatest number ");
		}
	}

}
