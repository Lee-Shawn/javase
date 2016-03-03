package day03;

/*
 * 1. java编译器编译一个java源文件的时候，会把成员变量的声明语句提前至类的最前端
 * 2. 成员变量的初始化工作都是在构造函数中执行的
 * 3. 一旦经过java编译器编译执行后，那么构造代码块的代码就会被移到构造函数中执行，构造函数中的代码最后执行
 * 4. 成员变量的初始化与构造代码块的执行按照代码的顺序执行
 */
public class Demo5 {
	Demo5() {
		i = 4;
	}
	
	{
		i = 1;
	}
	
	int i = 2;
	
	public static void main(String[] args) {
		Demo5 d = new Demo5();
		System.out.println(d.i);
	}
}
