package day15;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Demo2 {
	public static void main(String[] args) {
		JFrame f = new JFrame("window");
		FrameUtil.frame(f, 300, 300);
		
		// ��Ϣ��
		JOptionPane.showMessageDialog(f, "Welcome to Java Swing", "NOTICE", JOptionPane.INFORMATION_MESSAGE);
		// �����
		JOptionPane.showMessageDialog(f, "NO SMOKING", "Warning", JOptionPane.WARNING_MESSAGE);
		// �����
		JOptionPane.showMessageDialog(f, "The website you look for is not found", "Error", JOptionPane.ERROR_MESSAGE);
		// �����
		JOptionPane.showInputDialog("Input your password");
		// ȷ�Ͽ�
		JOptionPane.showConfirmDialog(f, "Are you sure ?");
	}
}
