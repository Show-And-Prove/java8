package test4;

public class ElementaryStudent extends Student{



	public ElementaryStudent(String name, int jum1, int jum2, int jum3) {
		super(name, jum1, jum2, jum3);
	}

	@Override
	public int computeTot(int jum1, int jum2, int jum3) {
		return jum1+jum2+jum3;
	}

	@Override
	public double computeAvg(int jum1, int jum2, int jum3) {
		return (float) (jum1+jum2+jum3)/3;
	}
}