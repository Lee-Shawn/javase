package day22;

public class Demo7 {
	public static void main(String[] args) {
		Son s = new Son();
//		s.paint();
		Mother m = new Mother(s);
//		m.paint();
		Father f = new Father(m);
		f.paint();
	}
	
}

class Work {
	public void paint() {
		System.out.println("»­»­");
	}
}

class Son extends Work {
	
	Work work;
	
	@Override
	public void paint() {
		System.out.println("¶ù×Ó¸ºÔð»­»­");
	}
}

class Mother extends Work {
	Work work;
	
	public Mother(Work work) {
		this.work = work;
	}
	
	@Override
	public void paint() {
		work.paint();
		System.out.println("ÂèÂèÉÏÍ¿ÁÏ");
	}
}

class Father extends Work {
	Work work;
	
	public Father(Work work) {
		this.work = work;
	}
	
	@Override
	public void paint() {
		work.paint();
		System.out.println("°Ö°Ö¼Ó»­¿ò");
	}
}