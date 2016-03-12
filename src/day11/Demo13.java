package day11;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class Demo13 {
	public static void main(String[] args) {
		new MyBorderLayout();
	}
}

@SuppressWarnings("serial")
class MyBorderLayout extends Frame {
	
	Button b1 = new Button("East");
	Button b2 = new Button("Weat");
	Button b3 = new Button("South");
	Button b4 = new Button("North");
	Button b5 = new Button("Center");
	
	public MyBorderLayout() {
		this.setTitle("BorderLayout");
		this.setLayout(new BorderLayout());
		this.add(b1, BorderLayout.EAST);
		this.add(b2, BorderLayout.WEST);
		this.add(b3, BorderLayout.SOUTH);
		this.add(b4, BorderLayout.NORTH);
		this.add(b5, BorderLayout.CENTER);
		
		this.setSize(300, 300);
		this.setVisible(true);
	}
}
