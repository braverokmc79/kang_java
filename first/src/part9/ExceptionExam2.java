package part9;

public class ExceptionExam2 {

	public static void main(String[] args) {
		int i =10;
		int j =0;
		
		try{
			int k= divide(i, j);
			System.out.println(k);			
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		//그러나 throws 를 사용않고 try - catch 로 예외처리만 해도 된다.
	}
	
	public static int divide(int i, int j) throws ArithmeticException {
		int k =i/j;
		return k;
	}
}

/// by zero



