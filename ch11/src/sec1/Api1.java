package sec1;
//java.lang 기본적으로 내장되어있으므로 import하지 않아도 됨

public class Api1 {
public static void main(String[] args) {
	//java.lang
	/*
	 	object : 자바에서 최상위 클래스
	 	System : 기본 입출력(*키보드 입력, 모니터 출력), JVM 동작 제어
	 	Class : 클래스 개념과 클래스 구성요스를 메모리로 로딩
	 	String : 문자열을 저장하고 여러 가지 정보를 얻을 때 사용
	 	StringBuffer, StringBuilder : 문자열을 저장하고 내부 문자열을 조작(분리/합치기)할 때 사용
	 	Math : 수학 함수를 이용할 때 사용
	 	Wrapper : Byte, Short, Character, Integer, Float, Double, Boolean, Long
	 			primitive type은 메서드를 가질 수 없으므로 Wrapper type의 메서드를 활용해야 함
	 */
	int a=1004;		//primitive type
	System.out.println(a);
	
	Integer b = new Integer(1004);	//Wrapper type
	System.out.println(b);
	
	String abc = "1004";
	int data = Integer.parseInt(abc);
	
	String ab = "1004.1234";
	float data2 = Float.parseFloat(ab);
	
	byte c = 66;
	Byte d = 66;
	
	short e = 1000;
	Short f = 1000;
	
	
	
	
	
	
	//primitive <=> Wrapper
	//char <=> Character
	//float <=> Float
	//double <=> Double
	//long <=> Long
	//boolean <=> Boolean
	}

}
