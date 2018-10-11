package reservation;

public class DesktopDeviceImp extends Device{

	DesktopDeviceImp(IMode mode){
		super(mode);
	}
	@Override
	void reserve() {
		// TODO Auto-generated method stub
		this.mode.makeReservaion();
	}
}
