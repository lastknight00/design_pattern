package factory_method.device;

import composite.Entity;

@SuppressWarnings("unused")
public abstract class Device extends Entity{
	final protected String model;
	final protected String serial;
	protected String alias;
	protected boolean powerOn;
	
	
	public Device(String model, String serial) {
		this(model, serial, model);
	}
	
	public Device(String model, String serial, String alias) {
		this.model = model;
		this.serial = serial;
		this.alias = alias;
		this.powerOn = false;
	}
	
	@Override
	public final String getAlias() {
		return alias;
	}
	
	@Override
	public final int getDeviceNum() {
		return 1;
	}

	public final void setAlias(final String alias) {
		this.alias = alias;
	}

	public String getModel() {
		return model;
	}

	public String getSerial() {
		return serial;
	}

	public abstract boolean powerOn();
	public abstract boolean powerOff();

	public boolean isPowerOn() {
		return powerOn;
	}

	@Override
	public String toString() {
		return "Device [model=" + model + ", serial=" + serial + ", alias=" + alias + "]";
	}
	
	@Override
	public void print(final int level) {
		for(int index = 0; index < level; index++) System.out.print("    ");
		System.out.println(this);
	}
}
