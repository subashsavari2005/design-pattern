package statedesignpattern;

public class ThreeYearKid implements KidState{

	@Override
	public void eat() {
		System.out.println("eat milk and liqiud only");		
	}

	@Override
	public void play() {
		System.out.println("play with toys and robots");
	}

}
