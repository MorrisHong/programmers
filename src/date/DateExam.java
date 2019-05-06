package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss a zzz");
		System.out.println(format.format(date));
		
	}
}
