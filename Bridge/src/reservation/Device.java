package reservation;

abstract public class Device {
	IMode mode;
	Device(IMode mode){
		this.mode = mode;
	}

	abstract void reserve();

}
