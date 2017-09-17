package first;

public class OperatorExam {
	
	public static void main(String[] args) {
		int i1 = -5;
		int i2 = +i1; //변화없이 -5 출력 
		//int i3 = -5;
		int i3 = -i1; //양수 5 출력
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		int i4 = ++i3; // i3 =i3+1;
		System.out.println(i4); //6 출력
		System.out.println(i3); //6출력
		
		int i5 = i3++; // i3 =i3 +l; 증감되기전  i5에 6입력
		System.out.println(i5); // 6출력
		System.out.println(i3); // 7출력
		
		int i=5;
		int j=2;
		
		System.out.println(i+j);//7 출력
		System.out.println(i - j);// 3 출력
		System.out.println(i * 5); //10 출력
		
		// 2 출력 나머지값은 버린다. 정수값의 연산은 정수값만 출력된다.
		System.out.println(i/j);
		
		System.out.println(i/(double)j); //2.5 출력
		System.out.println(i % j);// 1 출력
	}
	
}
