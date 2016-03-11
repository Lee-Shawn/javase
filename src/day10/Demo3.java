package day10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo3 {
	public static void main(String[] args) {
		
		// 获取系统当前时间
		Calendar c = Calendar.getInstance();
		
		System.out.print(c.get(Calendar.YEAR)+"年");
		System.out.print(c.get(Calendar.MONTH)+1+"月");
		System.out.print(c.get(Calendar.DATE)+"日");
		System.out.print(c.get(Calendar.HOUR_OF_DAY)+":");
		System.out.print(c.get(Calendar.MINUTE)+":");
		System.out.println(c.get(Calendar.SECOND));
		
		// 获取系统当前时间
		Date date = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
		// 把日期转换成指定格式的字符串
		String time = sd.format(date);
		System.out.println(time);
	}
}
