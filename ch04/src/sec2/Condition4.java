package sec2;

public class Condition4 {

	public static void main(String[] args) {
		//점수를 입력받아 등급을 구하되, 등급은 90점 이상이면, "A", 80점 이상이면 "B", 70점 이상이면 "C", 60점 이상이면 "D", 그 밖의 점수는 "F"
		//상품은 등급이 "A"이면, "100년 묵은 산삼", "B"이면, "한우갈비세트",
		//"C"이면, "백화점 상품권", "D"이면, "문화상품권" 으로 하며, "F"는 "한입만"
		int jum = 84;
		String rank="";
		if(jum>=90) {
			rank="A";
		} else if(jum>=80) {
			rank="B";
		} else if(jum>=70) {
			rank="C";
		} else if(jum>=60) {
			rank="D";
		} else {
			rank="F";
		}
		/*
		 * switch문은 괄호 안의 값과 동일한 값을 갖는 case로 가서 실행문을 실행시킨다.
		 * switch( ){
		 * 		case " ":
		 * 			_____=" ";
		 * 			break;
		 */
		String presen="";
		switch(rank){
			case "A":
				presen="100년 묵은 산삼";
				break;
			case "B":
				presen="한우갈비세트";
				break;
			case "C":
				presen="백화점 상품권";
				break;
			case "D":
				presen="문화상품권";
				break;
			default:
				presen="한입만";
				break;
		}
				
			System.out.println("당신의 점수는 " + jum +"이며, "+"등급은 " + rank + "이고, " +"상품은 " + presen + "입니다." );
				
			
		
	}

}
