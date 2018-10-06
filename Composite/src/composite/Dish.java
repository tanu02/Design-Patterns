package composite;

import java.util.ArrayList;

public class Dish implements IIngredients{

	String dishName;	
	ArrayList<IIngredients> comprised = new ArrayList<IIngredients>();
	
	Dish(String dishName){
		this.dishName = dishName; 
	}
	
	@Override
	public void ingredientName() {
		// TODO Auto-generated method stub		
		System.out.println("Name of Dish - " + dishName);
		for(IIngredients leaf: comprised){
			
			leaf.ingredientName();
			
		}
		System.out.println();		
	}
	public void addIngredients(IIngredients part){
		comprised.add(part);
	}

}
