package sec2;

public class SoundableExample {
	private static void printSound(Soundable soundable){
		System.out.println(soundable.sound());
	}
	public static void main(String[] args) {
	printSound(new Cat());
	printsound(new Dog());
	}

}
