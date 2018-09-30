package decorator_Pizza;

public class CheesePizza extends PizzaDecorator {

	CheesePizza(IPizza basePizza){

		super(basePizza);

	}

	public String getDescription(){

		String extra = "Cheese ";
		return extra + super.getDescription();

	}

	public int getCost(){

		return 50 + super.getCost();

	}

}
