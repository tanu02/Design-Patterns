package reservation;

public class TabletDeviceImp extends Device{
	TabletDeviceImp(IMode mode){
		super(mode);
	}
	
	@Override
	void reserve() {
		// TODO Auto-generated method stub
		this.mode.makeReservaion();
	}
}
