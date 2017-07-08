package template_method;

import factory_method.device.Device;

public abstract class SafePowerOffDevice extends Device{
	public SafePowerOffDevice(String model, String serial) {
		super(model, serial);
	}
	
	public SafePowerOffDevice(String model, String serial, String alias) {
		super(model, serial, alias);
	}

	public void safePowerOff() {
		if(isPowerOn()) {
			preprocessPowerOff();
			powerOff();
		}
	}

	abstract protected void preprocessPowerOff();
}
