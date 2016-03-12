package day11;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;

public class Demo14 {
	public static void main(String[] args) {
		Frame f = new Frame("card");
		f.setLayout(new CardLayout());
		
		f.add(new Button("button one"), "card1");
		f.add(new Button("button two"), "card2");
		
//		f.setBounds(100, 100, 300, 300);
		f.setSize(300, 300);
		f.setVisible(true);
	}
}
