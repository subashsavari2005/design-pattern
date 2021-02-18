
public abstract class Games {

	abstract String gameName();

	abstract int playerCount();

	abstract String  matchResult();

	public void gameStart() {

		System.out.println("GAME STARTED");
	}

	public void gameEnd() {

		System.out.println("GAME END");
	}

	public final void getGameSummary() {
		gameStart();
		String gameName =  gameName();
		System.out.println(gameName);
		int playerCount =playerCount();
		System.out.println(playerCount);
		String matchResult =matchResult();
		System.out.println(matchResult);
		gameEnd();
	}

}
