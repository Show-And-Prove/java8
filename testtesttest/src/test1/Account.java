package test1;

public class Account {
	private int bal=0;
	final static int MIN_BAL=0;
	final static int MAX_BAL=1000000;
	
	public int getBal() {
		return bal;
	}
	public void setBalance(int bal) {
		if(bal>=MIN_BAL && bal<=MAX_BAL){
			this.bal = bal;
		}
	}
}


