package part5;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteExam2 {

	public static void main(String[] args) {
		long start =System.currentTimeMillis();
		FileInputStream fis =null;
		FileOutputStream fos =null;
		try{
			fis =new FileInputStream("src/part5/ByteExam1.java");
			fos =new FileOutputStream("byte2.txt");
			
			int readCount=-1;
			byte[] buffer =new byte[1024];
			while((readCount=fis.read(buffer))!=-1){
				fos.write(buffer, 0, readCount);
			}
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
		long end=System.currentTimeMillis();
		System.out.println("byte배열을  사용한 경우");
		System.out.println(end-start);
		
	}
	
}


//byte배열을  사용한 경우
//2


