package thread;

public class MusicPlayer extends Thread{

	int type;
	MusicBox musicBox;
	
	public MusicPlayer(int type, MusicBox mBox) {
		this.type = type;
		this.musicBox = mBox;
	}
	
	@Override
	public void run() {
		switch (type) {
		case 1:
			musicBox.music1();
			break;
		case 2:
			musicBox.music2();
			break;
		case 3:
			musicBox.music3();
			break;
		default:
			break;
		}
	}
}
