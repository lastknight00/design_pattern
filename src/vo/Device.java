package vo;

@SuppressWarnings("unused")
public abstract class Device {
	final protected String model;
	final protected String serial;
	protected String alias;
	protected boolean power;
	
	
	public Device(String model, String serial) {
		this.model = model;
		this.serial = serial;
		this.power = false;
	}
	public abstract String getModel();
	public abstract String getSerial();
	public abstract String getAlias();
	public abstract void setAlias(final String alias);
	public abstract boolean powerOn();
	public abstract boolean powerOff();
}
