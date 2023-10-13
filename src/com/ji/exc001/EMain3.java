package com.ji.exc001;

import java.io.FileReader;

//C:\Users\sdedu\Desktop\hello.txt
public class EMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileReader fr;
		try {
			fr = new FileReader("C:/Users/sdedu/Desktop/hello.txt");
			System.out.println(fr.read());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
