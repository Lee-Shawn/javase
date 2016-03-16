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
		JFrame f = new JFrame("登录");
		JPanel p = new JPanel();
		f.add(p);
		
		JLabel jName = new JLabel("帐号");
		JTextField juser = new JTextField(10);
		p.add(jName);
		p.add(juser);
		
		JLabel jpass = new JLabel("密码");
		JPasswordField jword = new JPasswordField(10);
		p.add(jpass);
		p.add(jword);
		
		JLabel jsex = new JLabel("性别");
		JRadioButton jman = new JRadioButton("男");
		JRadioButton jwoman = new JRadioButton("女");
		ButtonGroup bg = new ButtonGroup();
		bg.add(jman);
		bg.add(jwoman);
		p.add(jsex);
		p.add(jman);
		p.add(jwoman);
		
		JLabel jcity = new JLabel("城市");
		Object[] obj = {"北京", "杭州", "上海"};
		JComboBox city = new JComboBox(obj);
		p.add(jcity);
		p.add(city);
		
		JLabel jl = new JLabel("爱好");
		JCheckBox jc1 = new JCheckBox("篮球");
		JCheckBox jc2 = new JCheckBox("旅游");
		JCheckBox jc3 = new JCheckBox("足球");
		p.add(jl);
		p.add(jc1);
		p.add(jc2);
		p.add(jc3);
		
		JLabel js = new JLabel("说明");
		JTextArea jt = new JTextArea(20, 15);
		jt.setLineWrap(true);
		p.add(js);
		p.add(jt);
		
		
		FrameUtil.frame(f, 500, 300);
	}
}
