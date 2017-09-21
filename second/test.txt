package part5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CharIOExam02 {
	
	public static void main(String[] args) {
		BufferedReader br=null;
		PrintWriter pw=null;
		try{
			br =new BufferedReader(new FileReader("src/part5/CharIOExam02.java"));
			pw=new PrintWriter(new FileWriter("test.txt"));
			
			String line=null;
			while((line=br.readLine())!=null){
				pw.println(line);			
			}
			System.out.println("출력 완료");						
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			try{
				pw.close();
				br.close();
				
			}catch(Exception e){
				e.getMessage();
			}
		}
	}
	
}
