package part9;

public class ExceptionExam {
	public static void main(String[] args) {
		int i =0;
		int j=0;
		
		try{
			int k=i/j;
			System.out.println(k);
			
		}catch(ArithmeticException e){
			System.out.println("0으로 나눌수 없습니다."+e.toString());
		}finally{
			System.out.println("오류 유무 상관없이 실행!");
		}
		System.out.println("main end!!");
	}
}
//출력
//0으로 나눌수 없습니다.java.lang.ArithmeticException: / by zero
//오류 유무 상관없이 실행!
//main end!!

