
public class QuadraticEquations {

	public static void main(String[] args) {
		
	    double a = 2, b = 2, c = 5.6;
	    double r1, r2;

	    
	    double d = b * b - 4 * a * c;   

	    
	    if (d > 0) {

	      
	      r1 = (-b + Math.sqrt(d)) / (2 * a);
	      r2 = (-b - Math.sqrt(d)) / (2 * a);
	      
	      System.out.println("roots are real and different");
	      System.out.println("root 1 = "+r1+"  root 2 = "+r2 );
	    }

	    
	    else if (d== 0) {

	      
	      r1 = r2 = -b / (2 * a);
	      System.out.println("roots are real and equal");
	      System.out.println(" root1 = root 2 = "+r1);
	    }

	    
	    else {
          System.out.println("roots are complex and different");
	      double real = -b / (2 * a);
	      double imaginary = Math.sqrt(-d) / (2 * a);
	      
	      System.out.println("root1 = "+ real+" + "+ imaginary);
	      System.out.format("root2 =  "+ real+" - "+ imaginary);
	    }
	}

}
