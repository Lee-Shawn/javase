package day11;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class Demo10 {
	public static void main(String[] args) {
		
		Frame f = new Frame("Íø¸ñ²¼¾Ö");
		f.setLayout(new GridLayout(3, 3));
		
		for (int i = 0; i < 9; i++) {
			f.add(new Button("button"+(i+1)));
		}
		
		f.setSize(300, 300);
		f.setVisible(true);
	}
}
