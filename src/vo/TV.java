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
	public String getModel() {
		return model;
	}

	@Override
	public String getSerial() {
		return serial;
	}

	@Override
	public String getAlias() {
		return alias;
	}

	@Override
	public void setAlias(String alias) {
		this.alias = alias;
	}

	@Override
	public boolean powerOn() {
		if(power) {
			return false;
		} else {
			power = true;
			powerOnProcess();
			return true;
		}
	}
	
	private void powerOnProcess() {
		System.out.printf("%s(%s) TV power on\n", alias, model);
	}

	@Override
	public boolean powerOff() {
		if(!power) {
			return false;
		} else {
			power = false;
			powerOffProcess();
			return true;
		}
	}

	private void powerOffProcess() {
		System.out.printf("%s(%s) TV power off\n", alias, model);
	}


}
