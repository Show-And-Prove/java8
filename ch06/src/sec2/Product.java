package sec2;

public class Product {
	
	private String pid;
	private String pname;
	private int amount;
	private int price;
	private String img;
	
	public Product() {
		
	}
	
	public Product(String pid, String pname) {
		this.pid = pid;
		this.pname = pname;
	}
	
	
	public Product(String pid, String pname, int amount, int price) {
		this.pid = pid;
		this.pname = pname;
		this.amount = amount;
		this.price = price;
	}
	

	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	public int calcMoney(){
		return (this.amount*this.price);
	}

	public String calcRank(){
		if(price>=100000){
			return "고가";
		}else if(price<100000 && price>=50000){
			return "중저가";
		}else return "저가";
		
	}
	
	public void printImg(){
		System.out.println(this.img);
	}
	
	public void printProduct(){
		System.out.println("제품의 아이디 : "+this.pid);
		System.out.println("제품명: "+this.pname);
		System.out.println("제품 수량 : "+this.amount);
		System.out.println("제품 가격 : "+this.price);
		System.out.println("제품 이미지 : "+this.img);
	}
	
	
}
