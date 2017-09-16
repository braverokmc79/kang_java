package first;

public class ConstantExam {
	
	public static void main(String[] args) {
		int i;
		i =10;
		i =5;
		
		final int J;
		J =10;
		
		//J=5; 상수는 중간에 변경 불가
		
		double circleArea; //변수 낙타 표기법
		//1.상수 표기 예 - 고정된 값으로 코드내에 많이 사용하거나 복잡한 수일 경우 사용.
		final double PI  = 3.14159;  
		circleArea  = 3 * 3 * PI;
		
		
		//2. 상수 표기 예
		final int OIL_PRICE =1390;
		
		int totalPrice =50 * OIL_PRICE;
		
	}
}



