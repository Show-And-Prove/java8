package test1;

public class NewAccount {
    private String anumber;
    private String aowner;
    private int bal;
 
    public NewAccount(String anumber, String aowner, int bal) {
        this.anumber = anumber;
        this.aowner = aowner;
        this.bal = bal;
    }

	public String getAnumber() {
		return anumber;
	}

	public void setAnumber(String anumber) {
		this.anumber = anumber;
	}

	public String getAowner() {
		return aowner;
	}

	public void setAowner(String aowner) {
		this.aowner = aowner;
	}

	public int getBal() {
		return bal;
	}

	public void setBal(int bal) {
		this.bal = bal;
	}
 

}