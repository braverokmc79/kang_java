package first;

public class TypeCastingExam {

	public static void main(String[] args) {
		int x =50000;
		long y =x;
		
		long x2 =5;
		//int y2 =x2; 컴파일 에러
		int y2=(int)x2; // 강제 형변한 후 대입
		
	}
	
}
