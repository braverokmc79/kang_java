package part3;

public class ForExam {

	public static void main(String[] args) {
		int total =0;
		for(int i=1; i <=100; i++){
//			if(i % 2 !=0){
//				continue;
//			} //2550
			
			total =total + i;
			if(i==50){
				break;
			}
		}
		System.out.println(total);
		//출력 :1275
	}
	
}
