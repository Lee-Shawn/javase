package day04;

public class Demo7 {

	public static void main(String[] args) {
		Students s1 = new Students("文科班");
		BaseStudents s2 = new BaseStudents("计算机");
		JobStudents s3 = new JobStudents("软件工程");
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
		System.out.println(name+"学习马列主义");
	}
	
}

class BaseStudents extends Students {
	
	public BaseStudents(String name) {
		super(name);
	}
	
	public void study() {
		super.study();
		System.out.println(name+"学习javase");
	}
}

class JobStudents extends Students {
	
	public JobStudents(String name) {
		super(name);
	}
	
	public void study() {
		System.out.println(name+"学习android");
	}
}