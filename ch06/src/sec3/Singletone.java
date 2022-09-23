package sec3;
/*
 * 	싱글톤 : 자바 디자인 패턴 중에서 오로지 하나의 객체만 생성할 수 있도록 하는 객체지향 프로그래밍 패턴 
 * 	자기 자신, 메소드안에서 static이 걸려야함
 * 	
 */
public class Singletone {
	private static Singletone sintone = new Singletone();
	private Singletone()	{}
	static Singletone getInstance(){
		return sintone;
	}
	
}
