package com.ji.use001;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Da2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date da = new Date();
		Date crist = new Date();
		crist.setYear(da.getYear()-10);
		crist.setMonth(da.getMonth()+2);
		crist.setDate(da.getDate()+12);
		
		int month = crist.getMonth()+1;
		
		try {
			System.out.println(crist.getYear()+1900+"년 "+month+"월 "+crist.getDate()+"일");
			SimpleDateFormat sdf = new SimpleDateFormat("E"+"요일",Locale.KOREA);
			String s = sdf.format(crist);
			System.out.println(s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
