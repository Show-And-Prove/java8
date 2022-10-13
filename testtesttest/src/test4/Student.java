package test4;

public class Student {
	String schoolname;
	String bun;
	String name;
	int jum1;
	int jum2;
	int jum3;
	
	public Student(String name, int jum1, int jum2, int jum3) {
		this.name = name;
		this.jum1 = jum1;
		this.jum2 = jum2;
		this.jum3 = jum3;
	}
	
	public int computeTot(int jum1, int jum2, int jum3){
		int tot = jum1 + jum2 + jum3;
		return tot;
	}
	public double computeAvg(int jum1, int jum2, int jum3){
		double avg = (float)((jum1 + jum2 + jum3)/3);
		return avg;
	}
	
	public String computeHak(int jum1, int jum2, int jum3){
		int tot = jum1+jum2+jum3;
		if(tot/3>=90){
			return "A";
		} else if(tot/3>=80){
			return "B";
		} else if(tot/3>=70){
			return "C";
		} else if(tot/3>=60){
			return "D";
		} else {
			return "F";
		}
	}
	public String calcRes(){
		double avg = this.computeAvg(jum1, jum2, jum3);
		String res = "불합격";
		if(avg>=80) res="합격";
		return res;
	}
}
