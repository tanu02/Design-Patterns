package logging;

public class Logger {

	public static void main(String args[]){
		
		//First Thread
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				LogApplication ins1 = LogApplication.getInstance();

				System.out.println("Hash of First Instance: " + ins1.hashCode());
			}
		});

		//Second Thread
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				LogApplication ins2 = LogApplication.getInstance();

				System.out.println("Hash of Second Instance: " + ins2.hashCode());
			}
		});

		t1.start();
		t2.start();

	}
}