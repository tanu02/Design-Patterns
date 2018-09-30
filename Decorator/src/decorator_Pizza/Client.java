package decorator_Pizza;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPizza basePizza = new VegPizza();

		IPizza cornPizza = new CornPizza(basePizza);
		System.out.println(cornPizza.getDescription());
	
		IPizza cCPVPizza = new PepperPizza(new CornPizza(new CheesePizza(new VegPizza())));
		
		System.out.println(cCPVPizza.getDescription());

	}

}
