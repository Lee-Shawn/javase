package day01;

public class Demo02 {
	public static void main(String[] args) {
		int s = 3;
		
		/** switch只能是char、byte、short、int类型，jdk7以后可以是String
		 *  case后面必须是一个常量
		 *  每个case后面都要有break
		 *  不论什么顺序，都是先判断case语句
		 */
		switch (s) {
		case 1:
			System.out.println("C++");
			break;
		case 2:
			System.out.println("Java");
			break;
		case 3:
			System.out.println("PHP");
			break;
		default:
			System.out.println("...");
			break;
		}
	}
}
