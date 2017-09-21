package part7;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class ThreadA {
	public static void main(String[] args) {
		ThreadB b =new ThreadB();
		b.start();
		
		synchronized (b){
			try{
				System.out.println("b가 완료될때 까지 기다립니다.");
				b.wait();
			}catch(Exception e){
				e.printStackTrace();
			}
			System.out.println("Total is : " + b.total);
		}
	}
	
}



