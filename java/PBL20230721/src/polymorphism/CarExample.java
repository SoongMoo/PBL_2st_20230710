package polymorphism;

public class CarExample {
	public static void main(String [] args) {
		Car car = new Car();
		for(int i = 1; i<= 6 ; i++) {
			int  problemTire = car.run();
			switch(problemTire) {
			case 1 : 
				System.out.println("앞왼쪽 KumhoTireTire 교체");
				car.frontLeftTire = new KumhoTire(4, "앞왼쪽");
				break;
			case 2 : 
				System.out.println("앞왼쪽 HankookTireTire 교체");
				car.frontLeftTire = new HankookTire(4, "앞오른쪽");
				break;
			case 3 : 
				System.out.println("앞왼쪽 HankookTireTire 교체");
				car.frontLeftTire = new HankookTire(4, "뒤왼쪽");
				break;
			case 4 : 
				System.out.println("앞왼쪽 KumhoTireTire 교체");
				car.frontLeftTire = new KumhoTire(4, "뒤오른쪽");
				break;
			}
		}
	}
}
