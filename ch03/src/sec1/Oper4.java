package sec1;

public class Oper4 {

	public static void main(String[] args) {
		int a=200, b=100, c=20, d=10;
		//비교연산자 (==, !,>,>=,<,<=) -> true or false
		//== 같다
		//!= 같지 않다
		//> 크다(초과 --후)
		//>= 크거나 같다(이상==이후)
		//< 작다(미만 == 전)
		//<= 작거나 같다(이하==이전)
		System.out.println("a>b =>"+(a>b));	//true
		System.out.println("a!=b =>"+(a!=b));	//true
		System.out.println("a==b =>"+(a==b));	//false
		System.out.println("a>=b =>"+(a>=b));	//true
		System.out.println("a<b =>"+(a<b));		//false
		System.out.println("a<=b =>"+(a<=b));	//false
		System.out.println("a instanceof Integer => " +a instanceof String);	//true
		//논리 연산자(이항 연산)
		// 입력1	입력2	a>b && c>d	a>b || c>d
		// 0	0	0			0
		// 0	1	0			1
		// 1	0	0			1
		// 1	1	1			1
		
		System.out.println("a>b && c>d =>"+(a>b && c<d));	//false
		System.out.println("a<b || c<d =>"+(a>b || c<d));	//true
		System.out.println("!(a>b)=>"+(!(a>b)));	//false
		//삼항 => 조건 ? 참일때식 : 거짓일때식
		System.out.println(a>=b ? "크거나 같다" : "작다");
	}

}
