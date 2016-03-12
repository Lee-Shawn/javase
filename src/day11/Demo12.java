package day11;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

@SuppressWarnings("serial")
public class Demo12 extends Frame {
	
	Button b1 = new Button("button one");
	Button b2 = new Button("button two");
	Button b3 = new Button("button three");
	Button b4 = new Button("button four");
	
	public Demo12() {
		this.setTitle("flowlayout");
		this.setLayout(new FlowLayout());
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		
		this.setBounds(100, 100, 250, 250);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Demo12();
	}
}
