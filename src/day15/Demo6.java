package day15;

import java.awt.Button;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class Demo6 {
	public static void main(String[] args) {
		JFrame f = new JFrame("Êó±ê¼àÌý");
		Button b = new Button("°´Å¥");
		f.add(b);
		b.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("kkkkk");
			}
			
		});
		FrameUtil.frame(f, 300, 300);
	}
}
