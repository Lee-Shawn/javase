package day19;

public class Demo1 {
	public static void main(String[] args) {
		// IntegerCache中缓存了-128到127这些数
		Integer a = -128;
		Integer b = -128;
		System.out.println(a==b);
		
		Integer c = 127;
		Integer d = 127;
		System.out.println(c==d);
		
		Integer e = 128;
		Integer f = 128;
		System.out.println(e==f);
	}
}
