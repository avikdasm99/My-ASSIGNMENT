// Write a Java program to find the index of an array element
package a1;

public class ArrayIndex {
 public static void main(String[] args) {
   int[] a = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
   int t=18;
   for (int i = 0;i < a.length;i++) {
	   if (a[i] == t) {
		   System.out.println("Index position of "+t+" is:  "  +i);
	       }
       }
    }
}