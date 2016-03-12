package day11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class Demo4 {
	public static void main(String[] args) {
		
		Frame frame = new Frame("Panel");
		Panel p1 = new Panel();
		p1.setBackground(Color.BLACK);
		
		Panel p2 = new Panel();
		p2.setBackground(Color.RED);
		
		Panel p3 = new Panel();
		p3.setBackground(Color.YELLOW);
		
		frame.add(p1, BorderLayout.SOUTH);
		frame.add(p2, BorderLayout.CENTER);
		frame.add(p3, BorderLayout.NORTH);

		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
