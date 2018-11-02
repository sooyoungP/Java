package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public static String dateToString(Date d) {
		
		//날짜가 들어오면 문자 형태로 제공하다. 받은 사람이 필요하니까
		String s;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		s = sdf.format(d);
		return s;
	}
}