package logging;

public class LogApplication {
	static protected LogApplication app;
	private LogApplication(){

	}
	public static LogApplication getInstance(){

		if (app == null)  
		{ 
			synchronized (LogApplication.class) 
			{ 
				if(app==null) 
				{ 
					//because the app is null instantiate it
					app = new LogApplication(); 
				} 
			}
		}
		
		return app;
	}

}
