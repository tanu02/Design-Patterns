package ac;

public class VoltasACImp implements AC{

	@Override
	public void on() {
		System.out.println("Voltas AC: The AC has been put on");
	}

	@Override
	public void off() {
		System.out.println("Voltas AC: The AC has been put off");
	}

	
}
