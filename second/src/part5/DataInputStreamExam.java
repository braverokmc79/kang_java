package part5;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamExam {
	 public static int read3(){
		    int sum = 0;
		    //data.txt로부터 int값 3개를 읽어들여서 sum에 더하세요.
			  try(
		    	DataInputStream di =new DataInputStream(new FileInputStream("data2.txt"))
		    ){
			  for(int i=0; i<di.available(); i++){			  
				  sum += di.readInt();  
			  }
			  	
		      
		    }catch(Exception e){
		     	e.getMessage(); 
		    }

		    //아래는 테스트를 위한 코드입니다. 수정하지 마세요.     
		    return sum;
     }
	 
		public static void main(String[] args) {
			DataInputStreamExam ex = new DataInputStreamExam();
			System.out.println(ex.read3());
		}
}
