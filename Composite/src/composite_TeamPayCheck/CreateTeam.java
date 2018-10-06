package composite_TeamPayCheck;

public class CreateTeam {

	
	Manager getManager(){ 

		Manager manager = new Manager(200);		
		Lead lead = new Lead(150);
		Developer1 dev1 = new Developer1(100);		
		Developer2 dev2 = new Developer2(100);

		lead.addEmployee(dev1);
		lead.addEmployee(dev2);
		manager.addTeamMembers(lead);

		return manager;
	}
	
}
