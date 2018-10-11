package payment;

public class CardPayment implements IPayment
{
	
	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("\tCardPayment Debit");	
	}

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("\tCardPayment Credit");
	}

	@Override
	public void typeOfPayment() {
		// TODO Auto-generated method stub
		System.out.println("Hi.. this is CardPayment");	
		
	}


}
