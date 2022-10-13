package test2;
public class HankookTire extends Tire {
	public HankookTire(String location, int maxRotation){
		super(maxRotation, location);
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " Hankook Tire 수명 : "+(maxRotation-accumulatedRotation)+"회");
			return true;
		} else {
			System.out.println("**** "+location+" Hankook Tire 펑크 ****");
			return false;
		}
	}
}
