package strategy_Amazon;

import java.util.HashMap;

public class NormalTime implements IEvent{
	public static HashMap<String, Integer> itemPrice = new HashMap<String, Integer>();

	static{
		itemPrice.put(jeans, 2000);
		itemPrice.put(shirt,1500);
	}

	@Override
	public int getPrice(String item) {
		// TODO Auto-generated method stub
		return itemPrice.get(item);
	}



}
