/* 5. try to create class implementing 
Runnable interface and override run method to 
print something.then create 4 thread & 
   start all of them to call the same run method.*/
package z1;

class Simple implements Runnable{
public void run() {
	System.out.println("Avik das");
}
}
public class Prob5 {
public static void main(String[] args) {
	Thread t1=new Thread(new Simple());
	Thread t2=new Thread(new Simple());
	Thread t3=new Thread(new Simple());
	Thread t4=new Thread(new Simple());
	t1.start();
	t2.start();
	t3.start();
	t4.start();
}
}
