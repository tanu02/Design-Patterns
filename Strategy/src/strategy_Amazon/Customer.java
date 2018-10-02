package strategy_Amazon;

import java.util.HashMap;

public class Customer {
	IEvent festiv ;
	static int amount = 0;

	public Customer(IEvent festiv) {		
		this.festiv = festiv;
	}

	public void purchase(String item){
		amount += festiv.getPrice(item);
	}

	public void addStrategy(IEvent season){
		this.festiv = season;
	}
	
	public int getTotal(){
		return amount;
	}
	
	public void resetAmount(){
		amount = 0;
	}


}
