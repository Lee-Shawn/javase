package day11;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class Demo7 {
	public static void main(String[] args) {
		
		Frame f = new Frame("Textfiled");
		f.setLayout(new GridLayout(2, 3));
		Label l = new Label("please input text.");
		
//		l.setAlignment(Label.RIGHT);
		TextField t = new TextField();
		t.setBackground(Color.gray);
		
		f.add(l);
		f.add(t);
		f.setSize(300, 300);
		f.setVisible(true);
	}
}
