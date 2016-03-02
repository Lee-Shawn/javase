package day02;

public class Demo12 {
	public static void main(String[] args) {
		Cars car = new Cars();
		car.carName = "BMW";
		car.carColor = "Blue";
		car.carWheel = 3;
		car.run();
		
		Factory f = new Factory();
		f.facName = "XXX Repair Factory";
		f.facAddress = "hangzhou";
		f.facPhone = "12345678";
		f.repair(car);
	}
}

/**
 * ������
 * ������4������ʱ����run��û��4������ʱ��ȥ��������
 * @author Shawn
 *
 */
class Cars {
	public String carName;
	public String carColor;
	public int carWheel;
	
	public void run() {
		if (carWheel == 4) {
			System.out.println(carName + " running...");
		} else {
			System.out.println(carName + " need repair...");
		}
	}
}

/**
 * ������
 * @author Shawn
 *
 */
class Factory {
	public String facName;
	public String facAddress;
	public String facPhone;
	
	public Cars repair(Cars car) {
		if (car.carWheel != 4) {
			System.out.println("It's repairing...");
			car.carWheel = 4;
			System.out.println("Well done.");
			car.run();
		}
		
		return car;
	}
}