package day11;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextArea;

public class Demo8 {
	public static void main(String[] args) {
		
		Frame f = new Frame("textarea");
		f.setLayout(new GridLayout(2, 3));
		
		Label a = new Label("please input text");
		
		TextArea t = new TextArea();
		
		f.add(a);
		f.add(t);
		f.setSize(300, 300);
		f.setVisible(true);
	}
}
