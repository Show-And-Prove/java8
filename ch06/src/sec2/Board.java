package sec2;

public class Board {
	private int lnum;
	private String lname;
	private String lnaeyong;
	private String writter;
	private String wday;
	public int getLnum() {
		return lnum;
	}
	public void setLnum(int lnum) {
		this.lnum = lnum;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getLnaeyong() {
		return lnaeyong;
	}
	public void setLnaeyong(String lnaeyong) {
		this.lnaeyong = lnaeyong;
	}
	public String getWritter() {
		return writter;
	}
	public void setWritter(String writter) {
		this.writter = writter;
	}
	public String getWday() {
		return wday;
	}
	public void setWday(String wday) {
		this.wday = wday;
	}
	
	public void boardWrite(int lnum, String lname, String lnaeyong, String writter, String wday){
		this.lnum = lnum;
		this.lname = lname;
		this.lnaeyong = lnaeyong;
		this.writter = writter;
		this.wday = wday;
	}
	
	public void boardUpdate(int lnum){
		
	}
	
	public void boardDelete(){
		
	}
	
	public void boardSearch(){
		
	}
	
}
