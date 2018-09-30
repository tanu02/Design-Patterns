package decorator_Pizza;

public class PizzaDecorator implements IPizza{

	IPizza basePizza;

	PizzaDecorator(IPizza basePizza){

		this.basePizza = basePizza;

	}

	public String getDescription(){

		return this.basePizza.getDescription();

	}

	public int getCost(){

		return this.basePizza.getCost();

	}
}