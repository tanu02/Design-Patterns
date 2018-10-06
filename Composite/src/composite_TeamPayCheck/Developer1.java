package composite_TeamPayCheck;

//Developer being leaf node will not have any list
public class Developer1 implements IEmployee{
	int payCheck = 0;	

	 Developer1(int pay){
		this.payCheck = pay;
	}

	public int getPayCheck(){
		return payCheck;
	}
}
