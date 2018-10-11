package payment;

public class CashPayment implements IPayment{
	
	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("\tCashPayment Debit");
	}

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("\tCashPayment Credit");
	}

	@Override
	public void typeOfPayment() {
		// TODO Auto-generated method stub
		System.out.println("Hi.. this is CashPayment");	
		
	}

}
