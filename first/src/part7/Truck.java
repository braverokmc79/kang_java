package part7;

public class Truck extends Car{

	
	public Truck(){
		//super(); //super 는 부모 생성자 호출, 기본생성자만 호출한다.
		super("자동차"); 
		 
		System.out.println("Truck의 기본 생성자입니다.");
	}
	
}
