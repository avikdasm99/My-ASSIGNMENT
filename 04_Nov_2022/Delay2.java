/* 2.now write the same program using Runnable interface */
package z1;

public class Delay2 implements Runnable {
public void run() {	
	System.out.println("current Thread : "+Thread.currentThread().getName());
    }
public static void main(String[] args) {
	Delay2 obj=new Delay2();
	Thread t1=new Thread(obj);
	System.out.println("current Thread : "+Thread.currentThread().getName());
	try { t1.sleep(2000); }
	catch(Exception e) { System.out.println(e ); }
	t1.setName("Avik");
	t1.start();
  }
}
