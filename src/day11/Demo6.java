package day11;

import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;

public class Demo6 {
	public static void main(String[] args) {
		
		Frame f = new Frame("Checkbox");
		f.setLayout(new GridLayout(2, 3));
		
		Label l = new Label("���");
		
		Checkbox c1 = new Checkbox("����");
		Checkbox c2 = new Checkbox("��ʿ");
		Checkbox c3 = new Checkbox("����");
		Checkbox c4 = new Checkbox("�Ȼ�");
		Checkbox c5 = new Checkbox("��ʿ");
		
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
