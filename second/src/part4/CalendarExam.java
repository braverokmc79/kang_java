package part4;

import java.util.Calendar;

public class CalendarExam {
	public static void main(String[] args) {
		Calendar cal =Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));//2017
		System.out.println(cal.get(Calendar.MONTH)+1); //9
		System.out.println(cal.get(Calendar.DATE)); //21
		
		System.out.println(cal.get(Calendar.HOUR)); //5
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)); //5
		System.out.println(cal.get(Calendar.MINUTE));//38
		
		cal.add(Calendar.HOUR, 5);//현재 칼랜더에 시간을 5시간 더하는 방법. 5를 -5로 수정하면 5시가 전을 구할 수 있게 됩니다.
		System.out.println();
		
		System.out.println(cal.get(Calendar.YEAR));//2017
		System.out.println(cal.get(Calendar.MONTH)+1); //9
		System.out.println(cal.get(Calendar.DATE)); //21
		System.out.println(cal.get(Calendar.HOUR)); //10
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)); //10
	}
}















