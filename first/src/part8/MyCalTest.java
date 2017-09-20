package part8;

public class MyCalTest {
	
	public static void main(String[] args) {		
		Calculator cal = new MyCal();
		cal.plus(3, 4);
		int i=cal.exec(5, 6);
		System.out.println(i);  //11
		
		//interface 에서 static 메소드 사용시
		//cal.exec2(1,2) // 호출 불가
		
		//반드시 다음과 같은 형식으로 호출해야 한다.
		Calculator.exec2(1, 4);
	}
	
}
