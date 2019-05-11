package thread;

public class ThreadEx1 {
	public static void main(String[] args) {
//		MyThread1 t1 = new MyThread1("*");
//		MyThread1 t2 = new MyThread1("-");
		

//		Thread t1 = new Thread(new MyThread2("*"));
//		Thread t2 = new Thread(new MyThread2("-"));
		
		MyThread2 my1 = new MyThread2("*");
		MyThread2 my2 = new MyThread2("-");
		
		Thread t1 = new Thread(my1);
		Thread t2 = new Thread(my2);
		
				
		
		t1.start();
		t2.start();
	}
}
