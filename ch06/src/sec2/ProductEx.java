package sec2;

public class ProductEx {

	public static void main(String[] args) {
		Product pro1 = new Product();
		pro1.setPid("a01");
		pro1.setPname("냉장고");
		pro1.setAmount(3);
		pro1.setPrice(80000);
		pro1.setImg("icetank01.jpg");
		
		pro1.printProduct();
			
	}

}
