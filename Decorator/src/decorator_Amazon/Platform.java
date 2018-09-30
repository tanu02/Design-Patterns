package decorator_Amazon;

public class Platform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*IAmazon simpleUser = new SimpleUser();
		simpleUser.sell();
		simpleUser.purchase();
		
		PrimeUser primeUser = new PrimeUser(simpleUser);
		primeUser.sell();
		primeUser.purchase();
		
		DelightUser delightUser =  new DelightUser(primeUser);
		delightUser.sell();
		delightUser.purchase();*/
	
		DelightUser delightUser2 = new DelightUser(new PrimeUser(new SimpleUser()));
		delightUser2.sell();
		delightUser2.purchase();
	}

}
