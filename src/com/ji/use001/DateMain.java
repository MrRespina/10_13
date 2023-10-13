package com.ji.use001;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateMain {
	
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getYear()+1900);
		System.out.println(now.getMonth()+1);
		System.out.println(now.getDate());
		
		String day[]= {"일","월","화","수","목","금","토"};
		System.out.println(day[now.getDay()]+"요일");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd E a hh:mm",Locale.KOREA);
		String s1 = sdf.format(now);
		System.out.println(s1);
		
		try {
			String s2 = "2023-10-12";
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd",Locale.KOREA);
			Date d = sdf2.parse(s2);
			System.out.println(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String christ = "2013.12.25";
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy.mm.dd");
		try {
			Date christ2 = sdf3.parse(christ);
			System.out.println(christ2);
			
			SimpleDateFormat sdf4 = new SimpleDateFormat("E");
			String christ3 = sdf4.format(christ2);
			System.out.println(christ3+"요일");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
