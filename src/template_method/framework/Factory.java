package template_method.framework;

import template_method.device.Device;

public abstract class Factory {
	public final Device create(String model, String serial, String room) {
		return create(model, serial, room, model);
	}
	
	public final Device create(String model, String serial, String room, String alias) {
		Device device = createDevice(model, serial, alias);
		registerDevice(device, room);
		return device;
	}
	
	protected abstract Device createDevice(String model, String serial, String alias);
	protected abstract void registerDevice(Device device, String room);
}
