package sec6;

public class StringBuilderExample {

	public static void main(String[] args) {

		String str = "";
		for(int i=1; i<100; i++){
			str += i;
		}
		System.out.println(str);
		
		System.out.println("**************");
		
		StringBuilder str1 = new StringBuilder();
		for(int i=1; i<100; i++){
			str1.append(i);
		}
		System.out.println(str1);
	}

}
