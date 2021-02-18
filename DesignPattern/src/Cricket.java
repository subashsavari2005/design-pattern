
public class Cricket extends Games{

	@Override
	String gameName() {
		return "CRICKET";
	}

	@Override
	int playerCount() {
		return 15;
	}

	@Override
	String matchResult() {
		return "INDIA WINS AGAINST PAKISTAN";
	}

}
