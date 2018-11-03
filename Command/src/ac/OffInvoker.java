package ac;

public class OffInvoker extends ICommand{

	public OffInvoker(AC ac) {
		this.ac = ac;
	}
	
	@Override
	public void execute() {
		ac.off();
	}

	
}
