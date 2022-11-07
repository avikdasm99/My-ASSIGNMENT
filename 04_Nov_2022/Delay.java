/* 1. Write a thread to print the thread name 
 * with a 2 sec delay with main thread.*/

package z1;

public class Delay extends Thread {
	public void run() {	
		System.out.println("current Thread : "+Thread.currentThread().getName());
	    }
  public static void main(String[] args) {
	  Delay t1= new Delay();
	System.out.println("current Thread : "+Thread.currentThread().getName());
	try { t1.sleep(2000); }
	catch(Exception e) { System.out.println(e ); }
		t1.setName("Avik");
		t1.start();
	  
}
}
