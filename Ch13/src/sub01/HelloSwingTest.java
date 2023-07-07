package sub01;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * 날짜 : 2023/07/07
 * 이름 : 최동일
 * 내용 : Java Swing 실습하기
 * 
 * GUI프로그래밍
 * - 사용자가 편리하게 프로그램을 사용할 수 있게 윈도우를 지원하는 프로그래밍
 * - 편리한 GUI 개발을 위해 windowbuilder를 설치
 * 
 */
public class HelloSwingTest {

	public static void main(String[] args) {
		
		//윈도우 생성
		JFrame frame = new JFrame("Hello Swing");
		frame.setPreferredSize(new Dimension(30,200));
		frame.pack();
		frame.setVisible(true);
		
		//컨테이너 생성
		Container pane = frame.getContentPane();
		
		
		//컴포넌트 배치
		JLabel label = new JLabel("hello swing");
		pane.add(label);
		
		JButton button = new JButton("확인");
		pane.add(button);
		button.setPreferredSize(new Dimension(2,2));
		
		
		
		
		
	}
}
