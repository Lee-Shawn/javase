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
	 * �ڲ�����Է����ⲿ������г�Ա
	 *
	 */
	class InClass {
		
		int var = 30;
		
		public void print() {
			System.out.println("�ڲ���ķ���"+OutClass.this.var);
		}
	}
	
	public void instance() {
		InClass ic = new InClass();
		ic.print();
	}
}