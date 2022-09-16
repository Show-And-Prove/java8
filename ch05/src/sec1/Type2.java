package sec1;

public class Type2 {

	public static void main(String[] args) {
		//reference(참조형) type : 여러개(다수)의 데이터를 저장하기 위한 기억장소로서 null값이 허용됨
		//참조형의 종류 : array(배열), enum(열거형), class(클래스), interface(인터페이스), map(맵), list(리스트), set(셋);
		int[] arr1 = {10,20,30};
		int[] arr2 = {10,20,30};
		//int[] arr3 = null;	//reference type은 null값을 허용하나 pointer(heap영역의 주소)가 null이 되어 참조할수없는 예외가 발생함
		//int a = null;	-primitive type은 null값일수없다. 초기화과정 필
		//arr3[0] = 20;
		//System.out.println(arr3[0]);
		//System.out.println(arr3[1]);
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println();
		System.out.println(arr1==arr2);
		System.out.println(arr1!=arr2);
		//참조형은 간접비교를 해야 하므로, 직접비교하게되면 포인터주소를 비교하게 되므로 서로다르게 인식된다.
	}

}
