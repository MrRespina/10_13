package com.ji.use001;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.TimeZone;

public class DateMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] location = TimeZone.getAvailableIDs();
		
		for(int i =0 ; i<location.length;i++) {
			//System.out.println(location[i]);
			
		}
		System.out.println("====================");
		TimeZone time = null;
		Date date = new Date();
		
		
		for (int i = 0; i < location.length; i++) {
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss (z Z)");
			
			time = TimeZone.getTimeZone(location[i]);
			sdf.setTimeZone(time);
			System.out.println(time.getDisplayName() + " : " + sdf.format(date));
		}

	}

}
