package statedesignpattern;

public class EightYearKid implements KidState{

	@Override
	public void eat() {
		System.out.println("eat all the foods");		
	}

	@Override
	public void play() {
		System.out.println("play with humans and relatives");
	}

}
