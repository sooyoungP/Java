package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public static String dateToString(Date d) {
		
		//��¥�� ������ ���� ���·� �����ϴ�. ���� ����� �ʿ��ϴϱ�
		String s;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		s = sdf.format(d);
		return s;
	}
}