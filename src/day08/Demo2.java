package day08;

public class Demo2 {
	public static void main(String[] args) {
		int money = 8;
		try {
			eat(money);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void eat(int money) throws NoMoneyException {
		if (money < 10) {
			throw new NoMoneyException("Ç®²»¹»£¡£¡£¡");
		}
		System.out.println("³ÔÄ¾Í°·¹");
	}
}

@SuppressWarnings("serial")
class NoMoneyException extends Exception {
	
	public NoMoneyException(String message) {
		super(message);
	}
}