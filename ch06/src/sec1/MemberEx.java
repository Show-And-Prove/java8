package sec1;

public class MemberEx {
	public static void main(String[] args){
		//클래스명 인스턴스명 = new 생성자함수();
		Member mem1 = new Member();
		mem1.setId("kkt");
		mem1.setPassword("1234");
		mem1.setName("김기태");
		System.out.println("아이디 : "+mem1.getId());
		System.out.println("비밀번호 : "+mem1.getPassword());
		System.out.println("이름 : "+mem1.getName());
		
		System.out.println();
		
		Member mem2 = new Member();
		mem2.setId("a1001");
		mem2.setPassword("1234");
		mem2.setName(" ");
		System.out.println("아이디 : "+mem2.getId());
		System.out.println("비밀번호 : "+mem2.getPassword());
		System.out.println("이름 : "+mem2.getName());
		
		System.out.println();
		
		Member mem3 = new Member("aaa","aaa1");
		System.out.println("아이디 : "+mem3.getId());
		System.out.println("비밀번호 : "+mem3.getPassword());
		
		System.out.println();
		
		Member mem4 = new Member( );
		System.out.println("아이디 : "+mem4.getId());
		System.out.println("비밀번호 : "+mem4.getPassword());
		
		System.out.println();
		
		Member mem5 = new Member("bbb","bbb1","비");
		System.out.println("아이디 : "+mem5.getId());
		System.out.println("비밀번호 : "+mem5.getPassword());
		System.out.println("이름 : "+mem5.getName());
		
		MemberController mc = new MemberController();
		mc.join("kkt", "1004", "김기태");
		mc.info();
		mc.login("kkt","1004");
		mc.info();


	}

}
