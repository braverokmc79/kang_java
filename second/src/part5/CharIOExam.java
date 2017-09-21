package part5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class CharIOExam {
	public static void main(String[]args){
		PrintWriter pw =null;
		try{
			pw=new PrintWriter("data.txt");
			String str="안녕하세요. PrintWriter입니다.";
		    pw.println(str);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				pw.close();
			}catch(Exception e){
				e.getMessage();
			}
		}
	}
}

