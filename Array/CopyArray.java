// Write a Java program to copy an array by iterating the array. 
package a1;

import java.util.Scanner;
public class CopyArray {
 public static void main(String[] args) {

     char[] copyFrom = { 'd', 'e', 't', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 'u', 'e', 'i' };  
    
     char[] copyTo = new char[7];  
   
     System.arraycopy(copyFrom, 3, copyTo, 0, 5);  
     
     System.out.println(String.valueOf(copyTo));  
 }  
}  
