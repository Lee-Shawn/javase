package day15;

import java.awt.Button;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class Demo7 {
	public static void main(String[] args) {
		JFrame f = new JFrame("����");
		Button b = new Button("��");
		f.add(b);
		FrameUtil.frame(f, 100, 100);
		
		b.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				switch (code) {
				case KeyEvent.VK_UP:
					System.out.println("��");
					break;
				case KeyEvent.VK_DOWN:
					System.out.println("��");
					break;
				case KeyEvent.VK_LEFT:
					System.out.println("��");
					break;
				case KeyEvent.VK_RIGHT:
					System.out.println("��");
					break;
				default:
					break;
				}
			}
			
		});
	}
}
