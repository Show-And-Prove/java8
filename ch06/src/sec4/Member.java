package sec4;

public class Member {	//멤버 필드(Field = Attribute)
	String name;
	String id;
	String password;
	int age;
	
	public Member(String name, String id, String password, int age) {//생성자(Constructor)
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;						
	}													
	
	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public void SetName(String name){	//메소드(Method)
		
	}
	
	
}
