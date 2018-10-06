package composite_TeamPayCheck;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateTeam team = new CreateTeam();				
		Manager manager = team.getManager(); 		
		System.out.println("Total Cost will be: " + manager.getPayCheck());
		
	}

}
