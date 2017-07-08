package area;

import iterator.list.MyList;
import factory_method.device.Device;

public class Room {
	final private String name;
	final private MyList<Device> deviceList;
	
	public Room(final String name) {
		this.name = name;
		this.deviceList = new MyList<>();
	}

	public String getName() {
		return name;
	}

	public MyList<Device> getDeviceList() {
		return deviceList;
	}
	
	public MyList<Device> add(final Device device) {
		this.deviceList.add(device);
		return this.deviceList;
	}
}
