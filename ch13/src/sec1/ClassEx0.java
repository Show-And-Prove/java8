package sec1;

import java.util.Date;

public class ClassEx0 {

	public static void main(String[] args) {
		//Generic(범용)은 자바 1.5 이상에서 쓸 수 있음
		Generic<Student> s1 = new Generic<Student>();
		Generic<General> g1 = new Generic<General>();
		Generic<Salary> s2 = new Generic<Salary>();
		Generic<Student> s3 = new Generic<>();	//자바 1.7 이상부터는 생성자 함수에 타입을 생략 가능
		Generic<Integer> i1 = new Generic<>();
		Generic<Date> d1 = new Generic<>();
		Generic<String> s4 = new Generic<>();
		
	}

}

class Generic<T> {
	T a;	//일반화(General)=범용화 과정을 거쳐 어떤 객체든지 활용할 수 있는 공용 데이터타입을 만드는 과정
}

class Member {
	General g;	//필요한 멤버나 객체를 모두 선언을 해야만 활용할 수 있다.
	Student s1;
	Salary s2;
	
}

class General {
	
}

class Student {
	
}

class Salary {
	
}