package day10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo3 {
	public static void main(String[] args) {
		
		// ��ȡϵͳ��ǰʱ��
		Calendar c = Calendar.getInstance();
		
		System.out.print(c.get(Calendar.YEAR)+"��");
		System.out.print(c.get(Calendar.MONTH)+1+"��");
		System.out.print(c.get(Calendar.DATE)+"��");
		System.out.print(c.get(Calendar.HOUR_OF_DAY)+":");
		System.out.print(c.get(Calendar.MINUTE)+":");
		System.out.println(c.get(Calendar.SECOND));
		
		// ��ȡϵͳ��ǰʱ��
		Date date = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("yyyy��MM��dd��HH:mm:ss");
		// ������ת����ָ����ʽ���ַ���
		String time = sd.format(date);
		System.out.println(time);
	}
}
