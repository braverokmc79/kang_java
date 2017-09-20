package part4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {

	public static void main(String[] args) {
		Date date =new Date();
		System.out.println(date.toString());//Thu Sep 21 05:15:03 KST 2017
		
		SimpleDateFormat ft =new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss a zzz");
		
		System.out.println(ft.format(date));//2017.09.21 at 05:15:03 오전 KST
		
		System.out.println(date.getTime()); //1505938503000
		
		long today=System.currentTimeMillis(); //1505938503072
		System.out.println(today);
		
		System.out.println(today-date.getTime()); //72
	}
}










