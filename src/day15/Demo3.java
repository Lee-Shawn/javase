package day15;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Demo3 {
	public static void main(String[] args) {
		JFrame f = new JFrame("��¼");
		JPanel p = new JPanel();
		f.add(p);
		
		JLabel jName = new JLabel("�ʺ�");
		JTextField juser = new JTextField(10);
		p.add(jName);
		p.add(juser);
		
		JLabel jpass = new JLabel("����");
		JPasswordField jword = new JPasswordField(10);
		p.add(jpass);
		p.add(jword);
		
		JLabel jsex = new JLabel("�Ա�");
		JRadioButton jman = new JRadioButton("��");
		JRadioButton jwoman = new JRadioButton("Ů");
		ButtonGroup bg = new ButtonGroup();
		bg.add(jman);
		bg.add(jwoman);
		p.add(jsex);
		p.add(jman);
		p.add(jwoman);
		
		JLabel jcity = new JLabel("����");
		Object[] obj = {"����", "����", "�Ϻ�"};
		JComboBox city = new JComboBox(obj);
		p.add(jcity);
		p.add(city);
		
		JLabel jl = new JLabel("����");
		JCheckBox jc1 = new JCheckBox("����");
		JCheckBox jc2 = new JCheckBox("����");
		JCheckBox jc3 = new JCheckBox("����");
		p.add(jl);
		p.add(jc1);
		p.add(jc2);
		p.add(jc3);
		
		JLabel js = new JLabel("˵��");
		JTextArea jt = new JTextArea(20, 15);
		jt.setLineWrap(true);
		p.add(js);
		p.add(jt);
		
		
		FrameUtil.frame(f, 500, 300);
	}
}
