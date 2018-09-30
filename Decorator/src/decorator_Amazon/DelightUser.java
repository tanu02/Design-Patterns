package decorator_Amazon;

public class DelightUser extends IDecorator{

	
	public DelightUser(IAmazon primeAmazonUser) {
		super(primeAmazonUser);
		// TODO Auto-generated constructor stub
	}
	public void sell(){
		super.sell();
	}
	
	public void purchase(){
		super.purchase();
		freeGift();
	}
	
	public void freeGift(){
		System.out.println("Being a Delight User you get Watch as a gift from Amazon");
		//System.out.println();
	}
	
	
}
