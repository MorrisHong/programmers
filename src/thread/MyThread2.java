package thread;

public class MyThread2 implements Runnable{
	String str;

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(str);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	MyThread2(String str){
		this.str = str;
	}
}
