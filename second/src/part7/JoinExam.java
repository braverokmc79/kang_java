package part7;

public class JoinExam {
	
	public static void main(String[] args) throws InterruptedException {
		MyThread5 thread =new MyThread5();
		thread.start();
		
		System.out.println("시작");
		
		thread.join();
		
		System.out.println("종료");
	}
}








