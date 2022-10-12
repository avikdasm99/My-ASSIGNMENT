/* 2. Write a do-while loop that asks the user to enter two numbers. 
 The numbers should be added and the sum displayed. 
 The loop should ask the user whether he or she wishes to perform the operation again. 
 If so, the loop should repeat; otherwise it should terminate. */

package oct_12;
import java.util.Scanner;

public class Sum {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int sum = 0;
    char op;
    do{
      System.out.println("Enter  numbers = ");
      int num1= s.nextInt();
      int num2 = s.nextInt();
      sum = sum+num1+num2;
      System.out.println("sum = "+sum);
      System.out.println("perform the operation again, y/n");
      op =s.next().charAt(0);
    }
    while(op =='y');
    System.out.println("sum "+sum);
  }
}