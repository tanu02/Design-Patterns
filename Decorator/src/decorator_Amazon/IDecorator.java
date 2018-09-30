package decorator_Amazon;

public abstract class IDecorator implements IAmazon{

	IAmazon simpleFeatures;
	public IDecorator(IAmazon simpleAmazonUser) {
		// TODO Auto-generated constructor stub
		this.simpleFeatures = simpleAmazonUser;
	}

	public void sell(){
		simpleFeatures.sell();
	}
	
	public void purchase(){
		simpleFeatures.purchase();
	}


}
