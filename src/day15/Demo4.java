package day15;

import java.awt.BorderLayout;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Demo4 {
	public static void main(String[] args) {
		JFrame f = new JFrame("记事本");
		
		JMenuBar jmb = new JMenuBar();
		
		JMenu jm1 = new JMenu("文件");
		JMenu jm2 = new JMenu("编辑");
		
		JMenu jm = new JMenu("切换");
		
		JMenuItem jmi1 = new JMenuItem("打开");
		
		JMenuItem ji = new JMenuItem("1212");
		
		TextArea ta = new TextArea(20, 30);
		
		f.add(ta);
		f.add(jmb, BorderLayout.NORTH);
		
		jmb.add(jm1);
		jmb.add(jm2);
		
		jm1.add(jmi1);
		
		jm1.add(jm);
		jm.add(ji);
		
		FrameUtil.frame(f, 400, 500);
	}
}
