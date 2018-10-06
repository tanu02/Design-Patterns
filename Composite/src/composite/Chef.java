package composite;

public class Chef {
	
	public Dish createDish(){
	
			LeafIngredient ingr11 = new LeafIngredient("ingr11");			
			LeafIngredient ingr21 = new LeafIngredient("ingr21");					
			Dish dish1 = new Dish("ingr1");
			Dish dish2 = new Dish("ingr2");			
			Dish finalDish = new Dish("Main Dish");
						
			dish1.addIngredients(ingr11);				
			dish2.addIngredients(ingr21);
			
			finalDish.addIngredients(dish1);
			finalDish.addIngredients(dish2);
			
			return finalDish;
	}
	
	public void presentDish(Dish dish){
		
		System.out.println("Main Dish - ");
		for(IIngredients leaf: dish.comprised){
			
			leaf.ingredientName();
			
		}
		
	}
}
