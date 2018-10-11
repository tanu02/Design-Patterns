package payment;

public abstract class Assistant {
	IPayment ipay;
	
	Assistant(IPayment ipay){
		this.ipay = ipay;
	}
	
	abstract protected void makePayment();
	abstract protected void makeRefund();
	abstract protected void typeOfPayment();
}
