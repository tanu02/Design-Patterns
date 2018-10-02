package strategy_Amazon;

public class Amazon {

	static String jeans = "Jeans";
	static String shirt = "Shirt";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NormalTime nt = new NormalTime();
		Customer customer = new Customer(nt);
		
		customer.purchase(jeans);		
		customer.purchase(shirt);
		System.out.println("Your total amount is " + customer.getTotal());
		customer.resetAmount();

		OfferTime ot = new OfferTime();
		customer.addStrategy(ot);
		
		customer.purchase(jeans);		
		customer.purchase(shirt);		
		System.out.println("Your total amount is " + customer.getTotal());
	}

}
