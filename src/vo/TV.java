package vo;

import factory_method.device.Device;

public class TV extends Device {

	public TV(String model, String serial) {
		super(model, serial);
	}

	public TV(String model, String serial, String alias) {
		super(model, serial, alias);
	}

	@Override
	public boolean powerOn() {
		if(powerOn) {
			return false;
		} else {
			powerOn = true;
			powerOnProcess();
			return true;
		}
	}
	
	private void powerOnProcess() {
		System.out.printf("%s(%s) TV power on\n", alias, model);
	}

	@Override
	public boolean powerOff() {
		if(!powerOn) {
			return false;
		} else {
			powerOn = false;
			powerOffProcess();
			return true;
		}
	}

	private void powerOffProcess() {
		System.out.printf("%s(%s) TV power off\n", alias, model);
	}


}
