/* 4." I want to learn JAVA" create this sentence by concatenating 5 java 
    methods using synchronized mechanism*/
package z1;

public class Concatenating extends Thread{

	synchronized String method1(String s) {return s; }
	synchronized String method2(String s) {return s; }
	synchronized String method3(String s) {return s; }
	synchronized String method4(String s) {return s; }
	synchronized String method5(String s) {return s; }
	
	public void run() {
		System.out.println(method1("I ")+method2("want ")+method3("to ")+method4("learn ")+method5("Java "));	
	}
	public static void main(String[] args) {
		Concatenating obj = new Concatenating();
		obj.start();
	}	
}