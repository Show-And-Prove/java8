package sec3;

public class MichelinTire extends Tire{

	public MichelinTire(int maxRotation, String location) {
		super(maxRotation, location);
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation){
			System.out.println(location + "MichelinTire 수명 : "+(maxRotation-accumulatedRotation)+"회전수");
			return true;
		}else{
			System.out.println("**** "+location+"MichelinTire 펑크 ****");
			return false;
		}
	}
	
	
}