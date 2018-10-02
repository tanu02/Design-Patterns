package strategy_Amazon;

import java.util.HashMap;

public class OfferTime implements IEvent{

	public static HashMap<String, Integer> itemPrice = new HashMap<String, Integer>();
	static{
		itemPrice.put(jeans, 1500);
		itemPrice.put(shirt,1000);
	}

	@Override
	public int getPrice(String item) {
		// TODO Auto-generated method stub
		return itemPrice.get(item);
	}


}
