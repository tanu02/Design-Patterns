package decorator_Pizza;

public class CornPizza extends PizzaDecorator {

	CornPizza(IPizza basePizza){

		super(basePizza);

	}

	public String getDescription(){

		String extra = "Corn ";
		return extra + super.getDescription();

	}

	public int getCost(){

		return 50 + super.getCost();

	}

}