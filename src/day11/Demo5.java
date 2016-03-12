package day11;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo5 {
	public static void main(String[] args) {
		
		Frame f = new Frame("button");
		
		Button b = new Button();
		b.setLabel("ok");
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		f.add(b);
		f.setSize(200, 100);
		f.setVisible(true);
	}
}
