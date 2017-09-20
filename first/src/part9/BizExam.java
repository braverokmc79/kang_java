package part9;

public class BizExam {

	public static void main(String[] args) {
		BizService biz =new BizService();
		biz.bizMethod(5);
		
		try{
			biz.bizMethod(-3);			
		}catch(Exception e){
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	}
}
//비지니스 메소드 시작
//비지니스 메소드 종료
//비지니스 메소드 시작
//매개변수 i는 0 이상이어야 합니다.