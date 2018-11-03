package ac;

public class Client {

	public static void main(String[] args) {
		
		//Command to put on the Voltas AC
		ICommand on = new OnInvoker(new VoltasACImp());
		on.execute();
		
		//Command to put off the Voltas AC
		ICommand off = new OffInvoker(new VoltasACImp());
		off.execute();
	}

}
