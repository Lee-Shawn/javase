package day08;

public class Demo1 {
	public static void main(String[] args) {
		
		String ip = "192.168.10.122";
		ip = null;
		try {
			feiQ(ip);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void feiQ(String ip) throws NoIPException {
		if (ip == null) {
			throw new NoIPException("没有连接网线");
		}
		System.out.println("登录...");
	}
}

class NoIPException extends Exception {
	
	private static final long serialVersionUID = 5422242214099479977L;

	public NoIPException(String message) {
		super(message);
	}
}