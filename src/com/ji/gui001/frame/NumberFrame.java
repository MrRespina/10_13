package com.ji.gui001.frame;

import java.awt.Color;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// 1 ~ 30까지의 숫자가 랜덤으로 나오게.
// array[]
// JLabel 사용

public class NumberFrame extends JFrame{
	
	JPanel p = new JPanel();
	JLabel[] l = new JLabel[31];
	
	public NumberFrame() {
		
		add(p);
		setTitle("뒤죽박죽 숫자");
		setSize(500,500);
		setVisible(true);	
		setLayout(null);
		p.setBackground(Color.DARK_GRAY);
		Random r = new Random();
		int x=0;
		int y=0;
		// TODO Auto-generated constructor stub	
		
		for(int i= 1; i<31 ; i++){
			l[i] = new JLabel(Integer.toString(i));
			x = r.nextInt(500)+1;
			y = r.nextInt(500)+1;
			l[i].setForeground(Color.CYAN);
			l[i].setLocation(x,y);
			l[i].setSize(50,50);
			
			p.add(l[i]);
			
		}
	
		
	}

}
