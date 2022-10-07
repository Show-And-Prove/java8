package sec2;

import java.util.Scanner;

import sec1.Student;

public class ListEx2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//학생리스트 선언
		boolean ck = true;
		int i =0; 
		while(ck){
			System.out.println("작업 번호 :");
			int num = sc.nextInt();
			Student s = new Student();
			switch(num){
			i++;
			case 1:
				s.setNum(i);
				System.out.print("\n학생 이름 : ");
				s.setName(sc.next());
				System.out.print("\n학생 점수 : ");
				s.setJumsu(sc.nextInt());
				Insert(s);
				break;
			case 2:
				System.out.print("검색할 학생 번호 : ");
				int bun = sc.nextInt();
				e = select(bun);
				System.out.println("학생번호 : "+s.getNum());
				break;
			case 3:
				System.out.println("수정할 학생 번호 : ");
				int no = sc.nextInt();
				s.setNum(no);
				System.out.print("\n학생 이름 : ");
				s.setName(sc.next());
				System.out.println("\n학생 점수 : ");
				s.setJumsu(sc.nextInt());
				update(s);
				break;
			case 4:
				System.out.println("삭제할 학생 번호");
				int no2 = sc.nextInt();
				s.setNum(no2);
				delete(s);
				break;
			case 5:
				System.out.println("학생명단\n번호\t이름\t점수");
				for(int a=0;a<sList.size();i++){
					Student r = new Student();
					r = s.List.get(a);
					int col1 = r.getNum();
					String col2 = r.getName();
					int col3 = r.getJumsu();
					System.out.println(col1+"\t"+col2+"\t"+col3);
				}
				break;
			default:
				ck=true;
			}
			i++;
		}
		//작업번호 : 1.학생추가, 2.학생검색, 3.학생수정, 4.학생삭제, 5.작업종료
	}
	static void insert (Student e){	//학생 추가
		sList.add(s);
	}
	static Student select(int i){
		Student s = new Student();
		s = sList.get(i);
		return s;
	}
	static void update(Student s){
		Student t = new Student();
		t.setNum(s.getNum());
		t.setName(s.getName());
		t.setJumsu(s.getJumsu());
		sList.set(s.getNum(), t);
	}
	static void delete(Student s){
		sList.remove(s.getNum());
	}
	static List<Student> select(){
		
	}
}
