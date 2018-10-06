package composite_TeamPayCheck;

import java.util.ArrayList;

//we could have created an abstract class containing member variables
public class Lead implements IEmployee{
	int payCheck;	
	ArrayList<IEmployee> team = new ArrayList<IEmployee>();
	
	Lead(int pay){
		this.payCheck = pay; 
	}
		
	public int getPayCheck(){
		int totalPay = this.payCheck;

		for(IEmployee employee: team){

			totalPay += employee.getPayCheck();

		}
		return totalPay;
	}
	
	public void addEmployee(IEmployee employee){
		this.team.add(employee);
	}
	
}
