package com.ji.exc001;

import java.util.InputMismatchException;
import java.util.Scanner;

/*	error/warning/exception
 * 	error : java 문법에 맞지 않게 써서 컴파일 자체가 불가능한 상태. 완성본 자체가 나오지 않음.
 *  warning : 컴파일은 가능하고 실행도 되지만 쓸데없는 코드나 문법이 들어있음.
 *  exception : 실행할 때 외부적인 요인에 의해 작동이 제대로 되지 않음 . 예측 후 대책을 세우는게 좋음.
 */

public class EMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		try {

			System.out.print("x 입력 : ");
			int x = s.nextInt();
			System.out.print("y 입력 : ");
			int y = s.nextInt();
			System.out.println("===========");
			System.out.println("x + y : " + (x + y));
			System.out.println("x + y : " + (x - y));
			System.out.println("x + y : " + (x * y));
			System.out.println("x + y : " + ((double) x / y));

		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("0 이외의 정수를 입력해주세요!");
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println("정수를 입력해주세요!");
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("배열이 인덱스 범위를 넘었습니다." );
		} finally {
			System.out.println("실행 완료");
		}

		s.close();

	}

}
