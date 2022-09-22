package sec2;


/*import java.util.Scanner;
import java.util.Date;

public class Board {
	Scanner sc = new Scanner(System.in);
	Date date = new Date();
	
	private int lnum;
	private String[] lname;
	private String[] lnaeyong;
	private String[] writter;
	private Date[] wday;
	
	public int getLnum() {
		return lnum;
	}
	public void setLnum(int lnum) {
		this.lnum = lnum;
	}
	public String[] getLname() {
		return lname;
	}
	public void setLname(String[] lname) {
		this.lname = lname;
	}
	public String[] getLnaeyong() {
		return lnaeyong;
	}
	public void setLnaeyong(String[] lnaeyong) {
		this.lnaeyong = lnaeyong;
	}
	public String[] getWritter() {
		return writter;
	}
	public void setWritter(String[] writter) {
		this.writter = writter;
	}
	public Date[] getWday() {
		return wday;
	}
	public void setWday(Date[] wday) {
		this.wday = wday;
	}
	
	public void boardWrite(int lnum, String lname, String lnaeyong, String writter, String wday){
		System.out.print("글번호를 입력해주세요.");
		this.lnum = sc.nextInt();
		System.out.print("제목을 입력해주세요.");
		this.lname[this.lnum] = sc.next();
		System.out.print("내용을 입력해주세요.");
		this.lnaeyong[this.lnum] = sc.next();
		System.out.print("작성자를 입력해주세요.");
		this.writter[this.lnum] = sc.next();
		//System.out.print("");
		//this.wday[this.lnum] = 
	}
	
	public void boardUpdate(int lnum,String lname,String lnaeyong){
		if(this.lnum == lnum){
			this.lname[lnum] = lname;
			this.lnaeyong[lnum] = lnaeyong;		
		} else if(this.lnum!=lnum){
			System.out.println("글번호를 다시 확인해주세요");
		}
	}
	
	public void boardDelete(int lnum){
		if(this.lnum == 3){
			System.out.println("글을 삭제합니다.");
			this.lname[lnum]="";
			this.lnaeyong[lnum]="";
		}
		
	}
	
	public void boardSearch(int lnum, String lname){
		System.out.println("번호 : "+this.lnum);
		System.out.println("제목 : "+this.lname);
		System.out.println("내용 : "+this.lnaeyong);
		System.out.println("작성자 : "+this.writter);
		System.out.println("작성일 : "+this.wday[lnum]);
		
	}
	
}
*/