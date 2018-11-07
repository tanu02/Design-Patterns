package instagram;

import java.util.ArrayList;

public class IGTV implements IApp{

	ArrayList<IUsers> listOfUsers =  new ArrayList<>();

	@Override
	public void add(IUsers user) {
		this.listOfUsers.add(user);
	}

	@Override
	public void remove(IUsers user) {
		this.listOfUsers.remove(user);
	}

	@Override
	public void notifyUser() {
		for(IUsers user: listOfUsers){
			user.getUpdate();
		}
	}
	
	public String getUpdate(){		
		return "Following are the Updates"; 
	}	
}
