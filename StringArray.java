// 1. Java program to find duplicate elements in an String array.
package oct_12;

public class StringArray {
	public static void main(String[] args) 
    {
        String[] a = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
 
        for (int i = 0; i < a.length-1; i++){
            for (int j = i+1; j < a.length; j++){
                if (  (a[i].equals(a[j]) ) ){
                    System.out.println("Duplicate Element is : "+a[j]);
                }
            }
        }
    }    
}
