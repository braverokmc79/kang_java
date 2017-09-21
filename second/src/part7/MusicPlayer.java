package part7;

public class MusicPlayer extends Thread {

	int type;
	MusicBox musicBox;
	
	public MusicPlayer(int type, MusicBox musicBox){
		this.type= type;
		this.musicBox =musicBox;
	}
	
	@Override
	public void run() {
		
		switch(type){
			case 1:
				musicBox.palyMusicA();
				break;
			case 2:
				musicBox.palyMusicB();
				break;
			case 3:
				musicBox.palyMusicC();
				break;
		}
		
	}
	
}
