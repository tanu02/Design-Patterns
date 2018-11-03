package ac;

public class OnInvoker extends ICommand {

	public OnInvoker(AC ac) {
		this.ac = ac;
	}
	
	@Override
	public void execute() {
		ac.on();
	}

}

