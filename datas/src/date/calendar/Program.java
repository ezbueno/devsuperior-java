package date.calendar;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date d1 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		Date d2 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

		System.out.println(sdf.format(d1));

		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(d1);
		cal1.add(Calendar.HOUR_OF_DAY, 4);
		d1 = cal1.getTime();

		System.out.println(sdf.format(d1));

		System.out.println("------------");

		System.out.println(sdf.format(d2));

		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(d2);
		int minutes = cal2.get(Calendar.MINUTE);
		int month = 1 + cal2.get(Calendar.MONTH);

		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
	}
}
