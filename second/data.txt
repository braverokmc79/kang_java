package part5;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteExam1 {
	
	public static void main(String[] args) {
		FileInputStream fis =null;
		FileOutputStream fos =null;
		try{
			fis=new FileInputStream("src/part5/ByteExam1.java");
			fos=new FileOutputStream("byte.txt");
			
			int readData ;
			while((readData=fis.read())!=-1){
				fos.write(readData);
			}
			//fos.flush();
			System.out.println("출력 되었습니다.");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				fos.close();
				fis.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
}
