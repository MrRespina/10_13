package com.ji.use001;

import java.util.Scanner;

public class TextMain2 {

	public static void main(String[] args) {

		String[] arr = null;
		Scanner s = new Scanner(System.in);
		System.out.print("입력 : ");
		String text = s.nextLine();
		int Result=0,count=0;
		
		if (text != null) {
			arr = text.split("/");
		}

		int[] arrInt = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {		

			try {
				arrInt[i] = Integer.parseInt(arr[i]);
				Result = Result + arrInt[i];
				count++;
			} catch (Exception e) {
				arrInt[i] = 0;
				
			} finally {
				if(arrInt[i]==0) {
					System.out.println("숫자 외의 것을 입력받음.");
				}else {
					System.out.println("입력한 숫자 : "+arrInt[i]);
				}
				
			}

		}
		
		System.out.println("===== 결과 =====");
		System.out.println("입력한 숫자의 합 : "+Result);
		System.out.println("입력한 숫자의 평균 : "+((double)Result/count));


	}

}
