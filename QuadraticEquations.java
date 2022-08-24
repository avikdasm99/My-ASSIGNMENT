//Q.2 WAJP to solve quadratic equations.


public class QuadraticEquations {

	public static void main(String[] args) {
		
	    double a = 2, b = 6, c = 2, r1 , r2 ;

	    double d = b * b - 4 * a * c;   

	    if (d > 0) {
	      r1 = (-b + Math.sqrt(d)) / (2 * a);
	      r2 = (-b - Math.sqrt(d)) / (2 * a);
	      
	      System.out.println("Roots are real and different");
	      System.out.println("root 1 = "+r1 );
	      System.out.println("root 2 = "+r2 );
	    }
	    else if (d== 0) {
	      r1 = r2 = -b / (2 * a);
	      System.out.println("Roots are real and equal");
	      System.out.println(" root1 = root 2 = "+r1);
	    }	    
	    else {
          System.out.println("Roots are complex and different");
	     
	    }
	}

}
