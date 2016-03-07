package day06;

public class Demo5 {
	public static void main(String[] args) {
		
		OutClass.InClass oc = new OutClass().new InClass();
		oc.print();
		
		OutClass o = new OutClass();
		o.instance();
	}
}

class OutClass {
	
	int var = 10;
	
	/**
	 * 内部类可以访问外部类的所有成员
	 *
	 */
	class InClass {
		
		int var = 30;
		
		public void print() {
			System.out.println("内部类的方法"+OutClass.this.var);
		}
	}
	
	public void instance() {
		InClass ic = new InClass();
		ic.print();
	}
}