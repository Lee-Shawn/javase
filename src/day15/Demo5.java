package day15;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo5 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JButton b = new JButton("开始");
		f.add(b);
		FrameUtil.frame(f, 150, 150);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton button = (JButton) e.getSource();
				if (button.getText().equals("开始")) {
					button.setText("暂停");
				} else {
					button.setText("开始");
				}
			}
		});
	}
}
