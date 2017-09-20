package part8;

import part7.Car;

public class Bus extends Car{

	public void ppangppang(){
		System.out.println("빵빵");
	}
	
	@Override
	public void run() {
		super.run();//부모 run 메소드 호출
		System.out.println("버스는 달린다");
	}
}
