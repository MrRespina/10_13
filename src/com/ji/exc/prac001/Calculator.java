package com.ji.exc.prac001;

public class Calculator {
	

	public Calculator() {
		// TODO Auto-generated constructor stub
	}
	
	public void Calc(int a,int b) {
		
		int price = a;
		int weight = b;
		double result = (double)price / weight;
		
		try {
			System.out.println("가격 / 무게");
			System.out.println(price+" / "+weight+" = "+result+"(g당 가격)");	
			
		}catch(Exception e) {
			System.out.println("계산 실패!");
			e.printStackTrace();
			
		}
		
		
	}

	
}
