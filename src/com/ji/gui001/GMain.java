package com.ji.gui001;

import com.ji.gui001.frame.MakeFrame;
import com.ji.gui001.frame.NumberFrame;

public class GMain {

	//GUI : AWS , Swing , JavaFX 등.
	//AWT : java 초창기에 나온 GUI 라이브러리. / OS에 따라서 모양이 모두 달라서 종류가 상당히 제한적이었음 .
	//Swing : AWT 다음에 나온 라이브러리. 느림 .별로 사용하지 않음. 디자인도 애매함. 더 최적화된 C 라인이 있음.(C,C++,...)
	//JavaFX : Swing의 느린 점을 보완한 라이브러리. 다양한 기능 추가 및 외관을 꾸밀 수 있다. 하지만 웹/ 앱에서 구현하면 되기에 그닥 사용X
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MakeFrame m = new MakeFrame();
		NumberFrame f = new NumberFrame(); 
	}

}
