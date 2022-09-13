package sec2;

import java.util.Scanner;

public class Condition3 {

	public static void main(String[] args) {
		//성명과 세 과목 (전산,PG,DB)의 점수를 입력받은 후
		//판정은 세 과목의 점수가 모두 70점 이상이면, "합격" 아니면 "탈락" 이며,
		//평균은 세 과목의 점수의 합계에서 3으로 나눈 값으로 하되, 소수점 이하까지 표시될 수 있도록 실수로 구하며,
		//비고는 세 과목 중에서 어느 하나라도 90점 이상이 있으면, "과목우수" 로 하고, 아니면 공백으로 구함
		//아래와 같은 형태로 출력 될 수 있도록 할 것.
		//*입력값예시
		//성명 : 김기태
		//전산점수 : 80
		//PG점수 : 95
		//DB점수 : 75
		//*출력예시
		//김기태님의 총점은 250점이며, 평균은 83.33이고, 합격하셨으며, 비고는 과목우수입니다.
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("성명 : ");
		String name = sc.next();
		System.out.print("\n전산점수 : ");
		int jum = sc.nextInt();
		System.out.print("\nPG점수 : ");
		int jum1 = sc.nextInt();
		System.out.print("\nDB점수 : ");
		int jum2 = sc.nextInt();
		String pan="";
		int tot = jum + jum1 + jum2;
		double avg = (float) tot / 3 ;
		if(jum>=70 && jum1>=70 && jum2>=70) {
			pan = "합격";
		}else {
			pan = "불합격";
		}
		String des="";
		if(jum>=90 || jum1>=90 || jum2>=90) {
			des="과목우수";
		}
		
		System.out.println(name+"님의 총점은 "+ tot + "이며, "+"평균은"+avg+"이고, "+ pan + "하셨으며, " + "비고는 " + des + "입니다.");
		sc.close();
	}

}
