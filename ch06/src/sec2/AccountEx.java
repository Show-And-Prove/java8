package sec2;


public class AccountEx {

	public static void main(String[] args) {
		Account acu1;	//초기화과정 
		acu1 = new Account();
		acu1.setAnum("계좌번호");
		acu1.setAname("계좌주");
		acu1.setIm(150000);
		acu1.setOm(90000);
		
		
		System.out.println("입금 : "+ acu1.im);
		System.out.println("출금 : "+acu1.om);
		System.out.println("잔액 : "+acu1.runBalance());
		System.out.println("계좌정보 : "+acu1.getAnum()+", "+ acu1.aname+", "+acu1.runBalance());
	}

}