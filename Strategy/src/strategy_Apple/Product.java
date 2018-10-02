package strategy_Apple;

public class Product {
	
	IProcessor processor;
	
	Product(IProcessor processor){
		this.processor = processor;
	}
	
	public void changeStrategy(IProcessor processor){
		this.processor = processor;
	}
	
	String getDescription(){
		return this.processor.getProDescription();
	}
	

}
