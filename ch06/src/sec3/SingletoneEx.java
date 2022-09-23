package sec3;

public class SingletoneEx {

	public static void main(String[] args) {
		//Singletone sintone1 = new Singletone();
		Singletone sintone1 = Singletone.getInstance();
		Singletone sintone2 = Singletone.getInstance();
		Singletone sintone3 = Singletone.getInstance();
		System.out.println(sintone1);
		System.out.println(sintone2);
		System.out.println(sintone3);
		if(sintone1==sintone2){
			System.out.println("sintone1은 sintone2입니다");
		}else {
			System.out.println("sintone1과 2는 서로 다른객체입니다");
		}
	}

}