package sec2;

public class CellPhoneEx {

	public static void main(String[] args) {
		CellPhone p1 = new CellPhone();
		p1.powerOn();
		p1.bell();
		p1.hangIn();
		p1.sendVoice("ㅎㅇ");
		p1.recieveVoice("ㅂㅇ");
		p1.hangOut();
		p1.powerOff();
	}

}
