package thread;

public class MusicBox {
	public void music1() {
		for(int i = 0; i < 10; i++) {
			System.out.println("John Mayer : gravity");
			try {
				Thread.sleep((int)(Math.random() * 1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void music2() {
		for(int i = 0; i < 10; i++) {
			System.out.println("김현철 : 왜그래 ");
			try {
				Thread.sleep((int)(Math.random() * 1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void music3() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Lauv : Easy Love");
			try {
				Thread.sleep((int)(Math.random() * 1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
