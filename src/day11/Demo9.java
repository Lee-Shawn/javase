package day11;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;

public class Demo9 {
	public static void main(String[] args) {
		
		Frame f = new Frame("list");
		f.setLayout(new GridLayout(1,2));
		
		Label l = new Label("select year");
		l.setAlignment(Label.CENTER);
		
		List list = new List(7, true);
		list.add("2010定");
		list.add("2011定");
		list.add("2012定");
		list.add("2013定");
		
		f.add(l);
		f.add(list);
		
		f.setSize(300, 300);
		f.setVisible(true);
	}
}
