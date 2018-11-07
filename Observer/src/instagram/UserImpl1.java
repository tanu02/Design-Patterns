package instagram;

public class UserImpl1 implements IUsers{
	IGTV app;
	String username;

	UserImpl1(IGTV app, String username){
		this.app = app;
		this.username = username;
	}

	@Override
	public void getUpdate() {
		System.out.println(username +  ": " + app.getUpdate());
	}
}
