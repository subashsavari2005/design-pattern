package statedesignpattern;

public class OneYearKid implements KidState{

	@Override
	public void eat() {
		System.out.println("eat milk only");		
	}

	@Override
	public void play() {
		System.out.println("play with toys");
	}

}
