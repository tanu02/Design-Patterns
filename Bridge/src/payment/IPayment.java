package payment;

public interface IPayment {
//	static int amount = 1000; it would be better to use abstract class 
	//because this amount is common in both implementation classes
	//here once defined I cannot change its value from 1000 to anything.
	
	void debit();
	void credit();
	void typeOfPayment();
}
	