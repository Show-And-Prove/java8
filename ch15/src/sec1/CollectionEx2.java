package sec1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CollectionEx2 {

	public static void main(String[] args) {

		List lst = new ArrayList();
		lst = new Vector();
		lst = new LinkedList();
		
		ArrayList lst2 = new ArrayList();
		//lst2 = new Vector();	형제 형변환이 힘듬
		
		method1(lst);
		method1(lst2);
		//method2(lst);	List로 선언되었는데 메소드의 매개변수는 ArrayList로 선언되었기 때문에 안된다.
		method2(lst2);
		
	}
	
	static void method1(List ls){
		
	}
	
	static void method2(ArrayList ls){
		
	}

}
