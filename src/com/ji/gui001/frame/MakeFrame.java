package com.ji.gui001.frame;

import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

//JFrame : swing에서 window 자체를 나타내는 class
//JPanel(subFrame),JButton,JLabel,JTextField 등 존재.
//Layout : flowLayout = 가운데 정렬
//			BorderLayout = Frame의 형식
//			GridLayout = 격자형태
//			SetLocation, setBounds = 위치 임의 지정
//			

public class MakeFrame extends JFrame {

	JPanel pl;

	public MakeFrame() {
		// TODO Auto-generated constructor stub
		setSize(500, 500);
		setTitle("GUI 연습");
		pl = new JPanel();
		pl.setLayout(new FlowLayout());

		for (int i = 1; i <= 10; i++) {
			pl.add(new Button(i+""));
		}
		
		add(pl);
		setVisible(true);
		
	}

}
