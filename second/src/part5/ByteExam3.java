package part5;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class ByteExam3 {
	
	public static void main(String[] args) {
		try(
			DataOutputStream out =new DataOutputStream(new FileOutputStream("data2.txt"));	
		){
		  out.writeInt(100);
		  out.writeInt(100);
		  out.writeInt(100);
//		  out.writeBoolean(true);
//		  out.writeDouble(50.5);
		}catch(Exception e){
			e.printStackTrace();
		}
	}	
	
}


