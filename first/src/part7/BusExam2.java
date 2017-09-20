package part7;

import part8.Bus;

//클래스 변환 강의
public class BusExam2 {
	
	public static void main(String[] args) {
		Car c =new Bus();
//		c.run();
		Bus bus =(Bus)c;
		bus.run();
		bus.ppangppang();
	}
	
}
//출력=>
//Car 의 기본 생성자 입니다.
//달리다
//버스는 달린다
//빵빵
