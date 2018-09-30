package decorator_Pizza;

public class VegPizza implements IPizza{

	public String getDescription(){

		String desc = "Veg Pizza" ; 
		return desc;

	}

	public int getCost(){

		return 100;

	}
}