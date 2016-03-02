package day01;

public class Demo01 {
	public static void main(String[] args) {
		int a = -124;
		System.out.println(Integer.toBinaryString(a));// 负数在计算机中以补码的方式存储
		
		byte x = 2;
		byte y = 4;
		byte z = (byte) (x + y);// byte、short、char类型的数据操作时，会自动转换成int类型
		System.out.println(z);
		
		byte i = 10;// 整数默认的数据类型是int型，10是常量，编译器在编译的时候已经确认了常量的值10没有超出byte的范围
		System.out.println(i);
		byte b = i;// 变量在运行的时候才回在内存中分配空间
		System.out.println(b);
	}
}
