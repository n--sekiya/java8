package java8.logic;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author n_sekiya
 */
public class LocalDateTime {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sample1("2018-03-02");
		sample2("2018/03/02", "yyyy/MM/dd");
		sample2("2018年03月02日", "yyyy年MM月dd日");
	}

	/**
	 */
	private static void sample1(final String date) {
		System.out.println("--------------------------------------");
		final LocalDate localDate = LocalDate.parse(date);
		System.out.println(localDate.toString());
		System.out.println(localDate.getDayOfWeek().toString());
		System.out.println(localDate.getDayOfMonth());
		System.out.println(localDate.getDayOfYear());
		System.out.println(localDate.isLeapYear());
		System.out.println(localDate.plusDays(12).toString());
	}

	/**
	 */
	private static void sample2(final String date, final String pattern) {
		System.out.println("--------------------------------------");
		final DateTimeFormatter datePattern = DateTimeFormatter.ofPattern(pattern);
		final LocalDate localDate = LocalDate.parse(date, datePattern);
		System.out.println(localDate.toString());
		System.out.println(localDate.getDayOfWeek().toString());
		System.out.println(localDate.getDayOfMonth());
		System.out.println(localDate.getDayOfYear());
		System.out.println(localDate.isLeapYear());
		System.out.println(localDate.plusDays(12).toString());
	}

}
