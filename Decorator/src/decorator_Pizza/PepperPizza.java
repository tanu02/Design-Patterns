package decorator_Pizza;

public class PepperPizza extends PizzaDecorator {

	PepperPizza(IPizza basePizza){

		super(basePizza);

	}

	public String getDescription(){

		String extra = "Pepper ";
		return extra + super.getDescription();

	}

	public int getCost(){

		return 50 + super.getCost();

	}

}
