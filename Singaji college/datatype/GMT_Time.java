package com.datatype;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class GMT_Time {

	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ISO_LOCAL_DATE	ISO_LOCAL_TIME	");
		String text = date.format(formatter);
		LocalTime parsedDate = LocalTime.parse(text, formatter);

			System.out.println(parsedDate);

}
	}
