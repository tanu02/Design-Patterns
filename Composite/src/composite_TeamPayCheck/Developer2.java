package composite_TeamPayCheck;

public class Developer2 implements IEmployee{
	int payCheck = 0;	
	
	Developer2(int pay){
		this.payCheck = pay;
	}
	
	public int getPayCheck(){
		return payCheck;
	}

}
