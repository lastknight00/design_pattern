package factory_method.device;

@SuppressWarnings("unused")
public abstract class Device {
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
	
	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
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
}
