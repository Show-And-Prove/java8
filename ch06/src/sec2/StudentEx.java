package sec2;

public class StudentEx {

	public static void main(String[] args) {
		Student stu1 = new Student ("김기태", 90,70,90);
		System.out.println("이름 :"+stu1.getID());
		System.out.println("총합 : "+stu1.calcTot());
		System.out.println("평균 : "+stu1.calcAvg());
	}

}
