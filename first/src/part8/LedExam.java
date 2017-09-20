package part8;

public class LedExam {

	public static void main(String[] args) {
		TV tv =new LedTV();
		tv.turnOn();
		tv.changeChannel(8);
		tv.changeVolume(50);
		tv.turnOff();
	}
}

//켜다
//Channel 을 지정하다.
//볼륨을 조정하다.
//끄다