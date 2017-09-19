package part5;

public class VariableScopeExam {
	int globalScope = 10;
	static int staticVal = 7;
	
	public void scopeTest(int value){
		int localScope =20;
		
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
	}
	
	
	public void scopeTest2(int value2){
		System.out.println(globalScope);
	//	System.out.println(globalScope);
   //	System.out.println(localScope);
	//	System.out.println(value2);
		System.out.println(staticVal);
	}
	
	public static void main(String[] args) {
//		System.out.println(globalScope);
//		System.out.println(localScope);
//		System.out.println(value);
		
		System.out.println(staticVal); // 7
		VariableScopeExam v1 =new VariableScopeExam();
		System.out.println(v1.globalScope); // 10
		VariableScopeExam v2 =new VariableScopeExam();
		
		v1.globalScope=10;
		v2.globalScope=20;
		System.out.println(v1.globalScope); // 10
		System.out.println(v2.globalScope); // 20
		
		v1.staticVal=50;
		v2.staticVal=100;
		System.out.println(v1.staticVal); // 100
		System.out.println(v2.staticVal); //100
		System.out.println(VariableScopeExam.staticVal);//100
		
	}
	
	
}
