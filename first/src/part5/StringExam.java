package part5;

public class StringExam {
	public static void main(String[] args) {
		String str1 ="hello";
		String str2 ="hello";
		
		String str3= new String("hello");
		String str4 =new String("hello");
		
		if(str1 == str2) System.out.println("str1 과 str2 는 같은 레퍼런스입니다. "); //출력
		
		if(str1 == str3) System.out.println("str1 과 str3 는 같은 레퍼런스입니다."); //출력 안됨
		
		if(str3 == str4) System.out.println("str3 과 str4 는 같은 레퍼런스입니다. ");//출력 안됨
		
		System.out.println(str1); //hello
		
		System.out.println(str1.substring(3)); //lo
		
		System.out.println(str1); //hello
		
	}
	
	
}


