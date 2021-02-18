package statedesignpattern;

public class StateMain {

	private int age;

	private KidState kidState;


	public StateMain(int age) {
		this.setAge(age);
	}

	public void setAge(int age) {
		this.age = age;
		if(age == 1) {
			kidState = new OneYearKid();
		}
		else if(age == 3) {
			kidState = new ThreeYearKid();
		}

		else {
			kidState = new EightYearKid();
		}
	}

	public void eat() {
		kidState.eat();
	}

	public void play() {
		kidState.play();
	}
	
	public static void main(String args[]) {
		StateMain sm = new StateMain(1);
		sm.eat();
		sm.play();
		sm.setAge(5);
		sm.eat();
		sm.play();
	}


}
