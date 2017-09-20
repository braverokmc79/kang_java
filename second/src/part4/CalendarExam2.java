package part4;

import java.util.Calendar;

public class CalendarExam2 {
	  public String hundredDaysAfter(){
		    //오늘부터 100일 뒤의 날짜를 "2016년1월1일"의 형식으로 return하세요.
			Calendar ca =Calendar.getInstance();
			
			ca.add(Calendar.DATE, 100);
			StringBuffer bf =new StringBuffer();
			String day=bf.append(ca.get(Calendar.YEAR)).append("년")
					.append(ca.get(Calendar.MONTH)+1).append("월")
					.append(ca.get(Calendar.DATE)).append("일").toString();
			return day;
	 }
	 public static void main(String[] args){
		 CalendarExam2 ca2=new CalendarExam2();
		 System.out.println(ca2.hundredDaysAfter());
		 
	 }
}
