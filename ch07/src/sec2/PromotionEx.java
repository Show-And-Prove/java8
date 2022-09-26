package sec2;

class A {}	//슈퍼클래스
class B extends A{ }
class C extends A{ }

class D extends B{ }
class E extends C{ }


public class PromotionEx {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = b;
		//B b2 = c;		형제 관계
		B b3 = d;
		//B b4 = e;
		
		//부모 자식관계상에서만 객체를 생성하거나 형변환이 가능함
		//자식부모 관계상에서는 자동 캐스팅 할 수 없으므로 강제 캐스팅해야 함
		//형제관계는 자동 캐스팅이나 강제 캐스팅 될 수 없다.

	}

}
