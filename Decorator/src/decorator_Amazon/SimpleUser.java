package decorator_Amazon;

public class SimpleUser implements IAmazon{

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("Simple User of Amazon - Selling" );
	}

	@Override
	public void purchase() {
		// TODO Auto-generated method stub
		System.out.println("Simple User of Amazon - Purchasing" );
	}

	
	
}
