package day08;

public class Demo4 extends RunTime {
	public static void main(String[] args) {
		Demo4 t = new Demo4();
		t.getTime();
	}
	
	public void diyCode() {
		int i = 0;
		while (i < 100000000) {
			i++;
		}
	}
}

abstract class RunTime {
	
	public final void getTime() {
		long startTime = System.currentTimeMillis();
		diyCode();
		long endTime = System.currentTimeMillis();
		System.out.println("Programming time:"+(endTime-startTime)+"ms");
	}
	
	public abstract void diyCode();
}
