package sec3;

public class CarEx {

	public static void main(String[] args) {
		Car car1 = new Car();
		
		for(int i=1;i<=10;i++){
			int errorLocation = car1.run();
			
			switch(errorLocation){
				case 1:
					System.out.println("앞쪽 왼쪽 바퀴 Michelin Tire로 교체");
					car1.frontLeftTire = new MichelinTire(100,"앞왼쪽");
					break;
				case 2:
					System.out.println("앞쪽 오른쪽 바퀴 Hankook Tire로 교체");
					car1.frontRigthTire = new HankookTire(100,"앞오른쪽");
					break;
				case 3:
					System.out.println("뒤쪽 왼쪽 바퀴 Kumho Tire로 교체");
					car1.backLeftTire = new KumhoTire(100,"뒤왼쪽");
					break;
				case 4:
					System.out.println("뒤쪽 오른쪽 바퀴 Hankook Tire로 교체");
					car1.backRightTire = new HankookTire(13,"뒤오른쪽");
					break;
			}
		}
	}

}
