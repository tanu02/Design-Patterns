package composite_TeamPayCheck;

import java.util.ArrayList;

public class Manager implements IEmployee{
	int payCheck;	
	ArrayList<IEmployee> team = new ArrayList<IEmployee>();

	Manager(int payCheck){
		this.payCheck = payCheck; 
	}

	public int getPayCheck(){
		int totalPay = this.payCheck;

		for(IEmployee employee: team){

			totalPay += employee.getPayCheck();

		}
		return totalPay;
	}
	
	public void addTeamMembers(IEmployee teamMate){
		this.team.add(teamMate);
	}


}
