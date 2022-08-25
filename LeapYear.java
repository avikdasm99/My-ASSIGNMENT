import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int y;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a year = ");
		y=obj.nextInt();
		
		if((y%4==0)&&(y%100!=0)||(y%400==0)) {        //logic
			System.out.println(y+" is leap year");
		}
		else {
			System.out.println(y+" is not leap year");
		}

	}

}
