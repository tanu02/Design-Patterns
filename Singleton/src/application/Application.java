package application;


public class Application {

	static protected Application app;
	private Application(){

	}
	public static Application getInstance(){

		if(app == null){
			app = new Application();	
		}
		return app;
	}

	public String getUpdate(){
		return "Here are the Updates";
	}
}
