package day11;

import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;

public class Demo6 {
	public static void main(String[] args) {
		
		Frame f = new Frame("Checkbox");
		f.setLayout(new GridLayout(2, 3));
		
		Label l = new Label("球队");
		
		Checkbox c1 = new Checkbox("湖人");
		Checkbox c2 = new Checkbox("勇士");
		Checkbox c3 = new Checkbox("雷霆");
		Checkbox c4 = new Checkbox("热火");
		Checkbox c5 = new Checkbox("骑士");
		
		f.add(l);
		f.add(c1);
		f.add(c2);
		f.add(c3);
		f.add(c4);
		f.add(c5);
		
		f.setSize(300, 300);
		f.setVisible(true);
	}
}
