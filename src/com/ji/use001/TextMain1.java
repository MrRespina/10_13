package com.ji.use001;

import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class TextMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello!";
		String s1 = new String("Here's Jonny! 3Days");
		System.out.println(s1.length());
		
		System.out.println(s1.charAt(1));

		if(s1.charAt(0)=='H') {			
			System.out.println("참");		
		}else {
			System.out.println("거짓");
		}
		
		String[] s2 = new String[25];
		String result = "";
		
		System.out.println(s1.startsWith("H"));
		System.out.println(s1.contains("Here's"));
		System.out.println(s1.replace("3", "삼"));

		System.out.println(s1.substring(0,6));
		
		String s3 = new DecimalFormat("###.###").format(123.4567890);
		System.out.println(s3);
		
		String s4 = String.format("무게 : %.2fkg", 123.4567890);
		System.out.println(s4);
		
		s = s + " world!";
		System.out.println(s);
		
		// String을 대량으로 추가함.
		StringBuffer sb = new StringBuffer(s);
		sb.append(" My name");
		sb.append(" is");
		sb.append(" Pin");
		
		System.out.println(sb);
		
		String s5= sb.toString();
		
		System.out.println(s5);
		
		//변수가 많을 때 사용할 것.
		String[] arr = s5.split(" ");
		for(int i = 0 ; i < arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		StringTokenizer st = new StringTokenizer(s5," "); //순번대로 , 속도 빠름
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		
		
		
		/*
		for(int i=0;i<s1.length();i++) {		
			if(s1.charAt(i)=='3') {
				s2[i]="삼";
			}else {
				s2[i] = ""+s1.charAt(i);
			}			
			result = result+s2[i];
			System.out.println(result);
		}
		*/

	}

}
