package day01;

public class Demo02 {
	public static void main(String[] args) {
		int s = 3;
		
		/** switchֻ����char��byte��short��int���ͣ�jdk7�Ժ������String
		 *  case���������һ������
		 *  ÿ��case���涼Ҫ��break
		 *  ����ʲô˳�򣬶������ж�case���
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
