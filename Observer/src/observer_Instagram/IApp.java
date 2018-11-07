package observer_Instagram;

public interface IApp {
	
	public void add(IUsers user);
	public void remove(IUsers user);
	public void notifyUser();
}
