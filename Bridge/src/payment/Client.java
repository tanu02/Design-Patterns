package payment;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager(new CardPayment());
		manager.makePayment();
		manager.makeRefund();
		
		Manager manager1 = new Manager(new CashPayment()); //in strategy no need to create new object of manager1
		manager1.makePayment();							   // just pass cashmpayement and set it in manager
		manager1.makeRefund();
	}

}
