package first;

public class OperatorExam4 {

	public static void main(String[] args) {
		int i =10;
		int j =10;
		
		System.out.println(i == j); //true
		System.out.println(i != j); //false
		System.out.println(i < j); //false
		System.out.println(i <= j); //true
		System.out.println(i > j); //false
		System.out.println(i >= j); //true
		
		//복합 대입 연산자
		i +=10; // i = i + 10;
		
		System.out.println(i); //20
		
		System.out.println(i -=5); //15
		System.out.println(i); //15
		
	}
	
}







