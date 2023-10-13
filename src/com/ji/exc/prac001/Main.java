package com.ji.exc.prac001;

import java.util.Scanner;

public class Main {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		start();
	}

	public static void start() {

		try {
			
			int a = getA();
			int b = getB();
			Calculator c = new Calculator();
			c.Calc(a, b);

		} catch (Exception e) {
			
			start();

		}

	}

	public static int getA() {

		int a;

		try {
			System.out.print("가격 입력 : ");
			a = s.nextInt();
		} catch (Exception e) {
			System.out.println("정수를 입력해주세요 !");
			return getA();
		}

		return a;

	}

	public static int getB() {

		int b;

		try {
			System.out.print("무게 입력(정수) : ");
			b = s.nextInt();
		} catch (Exception e) {
			System.out.println("정수를 입력해주세요 !");
			return getB();
		}

		return b;

	}

}
