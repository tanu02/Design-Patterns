package reservation;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Device device = new DesktopDeviceImp(new FlightMode());
		device.reserve();
	}

}
