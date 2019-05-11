package thread;

public class MusicBoxExam1 {
	public static void main(String[] args) {
		MusicBox box = new MusicBox();
		
		MusicPlayer hong = new MusicPlayer(1, box);
		MusicPlayer kim = new MusicPlayer(2, box);
		MusicPlayer kang = new MusicPlayer(3, box);
	
		hong.start();
		kim.start();
		kang.start();
	}
}
