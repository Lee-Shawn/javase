package day15;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Demo2 {
	public static void main(String[] args) {
		JFrame f = new JFrame("window");
		FrameUtil.frame(f, 300, 300);
		
		// 消息框
		JOptionPane.showMessageDialog(f, "Welcome to Java Swing", "NOTICE", JOptionPane.INFORMATION_MESSAGE);
		// 警告框
		JOptionPane.showMessageDialog(f, "NO SMOKING", "Warning", JOptionPane.WARNING_MESSAGE);
		// 错误框
		JOptionPane.showMessageDialog(f, "The website you look for is not found", "Error", JOptionPane.ERROR_MESSAGE);
		// 输入框
		JOptionPane.showInputDialog("Input your password");
		// 确认框
		JOptionPane.showConfirmDialog(f, "Are you sure ?");
	}
}
