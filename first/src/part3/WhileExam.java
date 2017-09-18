package part3;

public class WhileExam {
	public static void main(String[] args) {
/*		int i =0;
		
		while(i <10){
			System.out.println(i);
			i++; // i=i+1;
		}*/
		/*
		출력 =>
		0
		1
		2
		3
		4
		5
		6
		7
		8
		9*/
		
		int total =0;
		int i =1;
		while(i <= 100){
			total += i; //total + i;
			i++;
		}
		System.out.println(total);
		//출력  5050
		
		
		//무한 루프 예
		//반드시 wile 문을 빠져나올수 있는 구문을 넣어야 한다.
		while(true){
			System.out.println("hello");
		}
		
	}
}
