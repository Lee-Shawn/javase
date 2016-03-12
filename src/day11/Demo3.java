package day11;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class Demo3 {
	public static void main(String[] args) {
		
		Frame f = new MyFrame();
		f.setVisible(true);
	}
}

@SuppressWarnings("serial")
class MyFrame extends Frame {
	
	public MyFrame() {
		this.setTitle("Window");
		// ��ȡ������
		Toolkit t = Toolkit.getDefaultToolkit();
		// ��ȡ��ʾ���ߴ�
		Dimension d = t.getScreenSize();
		int screenHight = d.height;
		int screenWidth = d.width;
		// ���ô����С
		this.setSize(screenWidth/2, screenHight/2);
		// ���ô���λ��
		this.setLocation(screenWidth/4, screenHight/4);
		// �ػ�����
		this.repaint();
	}
}