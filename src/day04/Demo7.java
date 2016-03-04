package day04;

public class Demo7 {

	public static void main(String[] args) {
		Students s1 = new Students("�Ŀư�");
		BaseStudents s2 = new BaseStudents("�����");
		JobStudents s3 = new JobStudents("�������");
		s1.study();
		s2.study();
		s3.study();
	}
}

class Students {
	
	String name;
	
	public Students(String name) {
		this.name = name;
	}
	
	public void study() {
		System.out.println(name+"ѧϰ��������");
	}
	
}

class BaseStudents extends Students {
	
	public BaseStudents(String name) {
		super(name);
	}
	
	public void study() {
		super.study();
		System.out.println(name+"ѧϰjavase");
	}
}

class JobStudents extends Students {
	
	public JobStudents(String name) {
		super(name);
	}
	
	public void study() {
		System.out.println(name+"ѧϰandroid");
	}
}