package day11;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class Demo11 {
	public static void main(String[] args) {
		
		Frame f = new Frame("Íø¸ñ");
		f.setLayout(new GridBagLayout());
		GridBagConstraints g = new GridBagConstraints();
		
		g.gridx = 0;
		g.gridy = 0;
		f.add(new Button("button 1"), g);
		
		g.gridx = 0;
		g.gridy = 1;
		f.add(new Button("button 2"), g);
		
		g.gridx = 1;
		g.gridy = 0;
		f.add(new Button("button 3"), g);
		
		g.gridx = 1;
		g.gridy = 1;
		f.add(new Button("button 4"), g);
		
		f.setSize(300, 300);
		f.setVisible(true);
	}
}
