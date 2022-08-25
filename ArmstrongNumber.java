// Write a java program to check  the number is Armstrong or not .


public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 153, number, temp, total = 0;

        number = num;
        while (number != 0)
        {
            temp = number % 10;
            total = total + temp*temp*temp;   //logic
            number /= 10;
        }

        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");

	}

}
