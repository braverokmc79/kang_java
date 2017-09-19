package part5;

public class MyClassExam {

	public static void main(String[] args) {
		MyClass myclass =new MyClass();
		myclass.method1(); //m1 이 실행됨..
		myclass.method2(10); //10를 이용한 m2 실행
		int value=myclass.method3(); //m3 실행
		System.out.println("m3이 리턴한 값 " + value); //m3이 리턴한 값 10
		myclass.method4(5, 10);
		int value2 =myclass.method5(55);
		System.out.println("m5가 리턴한 값 :" + value2);
		
	}
	
}
