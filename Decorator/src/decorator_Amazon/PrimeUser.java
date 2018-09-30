package decorator_Amazon;

public class PrimeUser extends IDecorator{

	
	public PrimeUser(IAmazon simpleAmazon) {
		super(simpleAmazon);
		// TODO Auto-generated constructor stub
	}
	
	public void sell(){
		super.sell();
		getVoucher();
	}
	
	public void purchase(){
		super.purchase();
		getFreeDelivery();
	}
	
	void getVoucher(){
		System.out.println("Being a Prime User you get a Voucher of 100 bucks ");
		System.out.println();
	}
	void getFreeDelivery(){
		System.out.println("Being a Prime User you get Free Delivery");
		System.out.println();
	}
	
}
