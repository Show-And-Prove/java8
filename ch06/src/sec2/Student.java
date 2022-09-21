package sec2;

public class Student {
	public String name;
	public int kor;
	public int eng;
	public int mat;
	
	public Student(){
		
	}		
	
	public Student(String name) {
		this.name = name;
	}	
	
	public Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;		
	}	
	
	public int calcTot() {
		return (this.kor+this.eng+this.mat);
	}
	
	public int calcAvg() {	//평균 : double or float 
		return (this.kor+this.eng+this.mat)/3;
	}
	
	public String calcHak() {
		if((this.kor+this.eng+this.mat)/3>=90) {
			return "A";
		}if((this.kor+this.eng+this.mat)/3>=80) {
			return "B";
		}else 
			return "C";
	}
	public String calcRes() {
		if((this.kor+this.eng+this.mat)/3>=80) {
			return "합격";
		}else 
			return "불합격";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}
	
	
	
	
}