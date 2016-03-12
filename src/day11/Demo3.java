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
		// 获取工具类
		Toolkit t = Toolkit.getDefaultToolkit();
		// 获取显示器尺寸
		Dimension d = t.getScreenSize();
		int screenHight = d.height;
		int screenWidth = d.width;
		// 设置窗体大小
		this.setSize(screenWidth/2, screenHight/2);
		// 设置窗体位置
		this.setLocation(screenWidth/4, screenHight/4);
		// 重画窗体
		this.repaint();
	}
}