package part9;

public class MyCheckedException extends Exception {
	
	public MyCheckedException(String msg){
		super(msg);
	}
	
	public MyCheckedException(Exception e){
		super(e);
	}
}
