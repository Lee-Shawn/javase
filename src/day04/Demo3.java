package day04;

public class Demo3 {
	public static void main(String[] args) {
		Single s1 = Single.getInstance();
		System.out.println(s1);
	}
}

/**
 * 单例设计模式：保证一个类在内存中只有一个对象
 * @author Shawn
 *
 */
class Single {
	
	/**
	 * 私有化构造函数
	 */
	private Single() {}
	
	/**
	 * 声明本类的引用类型变量，使用该变量指向本类
	 */
	private static Single s = new Single();
	
	/**
	 * 提供一个公共静态的方法获取本类对象
	 */
	public static Single getInstance() {
		return s;
	}
	
}