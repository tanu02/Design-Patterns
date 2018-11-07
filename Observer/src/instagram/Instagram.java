package instagram;

public class Instagram {

	public static void main(String args[]){

		//create the instance of the app implementation
		IGTV app = new IGTV();
		//lets create some users
		IUsers user1 = new UserImpl1(app, "ABC");
		IUsers user2 = new UserImpl1(app, "XYZ");
		//add the users in the app
		app.add(user1);
		app.add(user2);
		//notify all the users about the updates
		app.notifyUser();
		
	}
}
