package part5;

public class StringMethodExam {

	public static void main(String[] args) {
		//String str =new String("hello");
		String str ="hello";
		System.out.println(str.length()); //5
		System.out.println(str.concat(" world")); //hello world
		System.out.println(str); //hello
		str =str.concat(" world"); 
		System.out.println(str);//hello world
		
		System.out.println(str.substring(3)); //lo world
		System.out.println(str.substring(3, 7)); //lo w
	}
	
}
