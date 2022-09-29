// Write a Java program to find the duplicate values of an array of integer values
package a1;
import java.util.Scanner; 
public class Duplicatevalues{
  public static void main(String[] args) {
	  
	  System.out.print(" Length of array = ");
      Scanner s= new Scanner(System.in);
      int n = s.nextInt();
      int[] a = new int[n];
      
      for(int i=0; i<a.length; i++){
      	System.out.print("Enter Element"+(i+1)+"= ");
      	a[i] = s.nextInt();
          }
        for (int i = 0; i< a.length; i++){
        
            for (int j = i+1; j< a.length; j++){
 
                if ((a[i] == a[j])){
      
                    System.out.println("Duplicate Element : "+a[i]);
                }
            }
        }
    }    
}
