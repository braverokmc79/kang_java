package part3;

public class IfExam {
	public static void main(String[] args) {
		int x =50;
		int y =60;
		
//		if(x < y){
//			System.out.println("x는 y 보다 작습니다.");
//			System.out.println("test");
//		}
		
		//{  대괄호를 하지 않았을 경우에는 if 다음 한 줄만 가능
//		if( x  < y)
//			System.out.println(" x 는 y와 같습니다.");
//			System.out.println("test");
		
		if(x == y){
			System.out.println("x 는 y 와 같습니다.");
		}else if(x < y){
			System.out.println("x 는 y 보다 작습니다.");
		}else{
			System.out.println("x 는 y 와 다릅니다.");
		}
	
		//출력 : x 는 y 보다 작습니다.
	}
	
}





