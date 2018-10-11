package payment;

public class Manager extends Assistant{

	public Manager(IPayment cardPayment) {
		// TODO Auto-generated constructor stub
		super(cardPayment);
		typeOfPayment();
	}

	@Override
	protected void makePayment() {
		// TODO Auto-generated method stub
		 ipay.debit();
	}

	@Override
	protected void makeRefund() {
		// TODO Auto-generated method stub
		ipay.credit();
	}

	@Override
	protected void typeOfPayment() {
		// TODO Auto-generated method stub
		ipay.typeOfPayment();
	}

}
