package part3;

import java.util.Scanner;

public class DoWhileExam {
	public static void main(String[] args) {
		int value=0;
		Scanner scan =new Scanner(System.in);
		
		do{
     		//반복할 문장들
		  value =scan.nextInt();
		  System.out.println("입력받은 값 :" + value);
				
		}while(value !=10);
		System.out.println("반복문 종료!!");
	}
}
/*1
입력받은 값 :1
2
입력받은 값 :2
3
입력받은 값 :3
10
입력받은 값 :10
반복문 종료!!*/