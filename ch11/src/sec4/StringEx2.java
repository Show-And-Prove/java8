package sec4;

import java.util.StringTokenizer;

public class StringEx2 {

	public static void main(String[] args) {
		
		String names = "김태엽&한태헌,안효준,고유진,유광현-이해나";	//&   ,		-
		
		// .split 문자열을 배열요소로 형변환
		String[] name = names.split("&|,|-");	// | 를 구분자로 
		/*
		for(int i=0;i<name.length;i++){
			System.out.println(name[i]);
		}*/
		for(String irum : name){	//향상된 for문
			System.out.println(irum);
		}
		System.out.println("*****************************************************************");
		String nick = "김도연/남송윤/조민재/이하영";
		StringTokenizer irums = new StringTokenizer(nick, "/"); 			//StringTokenizer(변수명, 구분자)
		int cntToken = irums.countTokens();	//토큰에 의해 발생된 요소의 수
		for(int i=0;i<cntToken;i++){
			String token = irums.nextToken();
			System.out.println(token);
		}
	}

}
