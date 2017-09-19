package part5;

public class MyClass {
	
	//public 리턴타입 메소드명 (매개변수 들) { 구현}
	//1.
	public void method1() {
		System.out.println("m1 이 실행됨..");
	}
	
	//2. 정수를 매개변수로 받아들여서 리턴값이 없는 경우
	public void method2(int x){
		System.out.println(x + "를 이용한 m2 실행");
	}
	
	//3. 아무것도 받아들이지 않았지만 값을 리턴
	public int method3(){
		System.out.println("m3 실행");
		return 10;
	}
	
	//4. 리턴값은 없고 매개변수가 있는 경우
	public void method4(int x, int y){
		System.out.println(x +y + "m4 실행");
	}
	
	//5. 매개변수가 존재하고 리턴값도 있는 경우
	public int method5(int y){
		System.out.println(y + " 이용한 m5 실행");
		return y*2;
	}
	
}





