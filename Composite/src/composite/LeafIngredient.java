package composite;

public class LeafIngredient implements IIngredients{

	String ingredientName;
	
	LeafIngredient(String name){
		this.ingredientName = name; 
	}
	
	@Override
	public void ingredientName() {
		// TODO Auto-generated method stub
		System.out.print("Name of Ingredient - " + ingredientName + "\t");
		
	}

	
}
