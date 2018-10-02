package strategy_Apple;

public class Apple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IProcessor pro10 = new ProcessorImp10NM();
		Product apple = new Product(pro10);
		System.out.println("Processor Description " + apple.getDescription());
		
		IProcessor pro14 = new ProcessorImp14NM();		
		apple.changeStrategy(pro14);		
		System.out.println("Processor Description " + apple.getDescription());
	}

}
