package day01;

public class Demo13 {
	public static String scoreLevel(int score) {
		
		String level = null;
		if (score >= 90) {
			level = "A";
		} else if (score >= 80) {
			level = "B";
		} else if (score >= 70) {
			level = "C";
		} else if (score >= 60) {
			level = "D";
		} else {
			level = "E";
		}
		
		return level;
	}
	
	public static void main(String[] args) {
		String scoreLevel = scoreLevel(88);
		System.out.println(scoreLevel);
	}
}
