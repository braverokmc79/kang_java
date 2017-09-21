package part7;

public class MusicBox {
	
	public void palyMusicA(){
		for(int i=0; i<10; i++){
			System.out.println("신나는 음악!!!");
			
			try{
				Thread.sleep((int)(Math.random()*100));
			}catch(Exception e){
				e.printStackTrace();
			}
		}	
	}
	
	public void palyMusicB(){
		for(int i=0; i<10; i++){
			System.out.println("슬픈 음악!!!");
			
			try{
				Thread.sleep((int)(Math.random()*100));
			}catch(Exception e){
				e.printStackTrace();
			}
		}	
	}
	
	public void palyMusicC(){
		for(int i=0; i<10; i++){
			System.out.println("카페 음악!!!");
			
			try{
				Thread.sleep((int)(Math.random()*100));
			}catch(Exception e){
				e.printStackTrace();
			}
		}	
	}
	
	
}

