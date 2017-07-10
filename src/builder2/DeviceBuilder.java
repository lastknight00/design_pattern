package builder2;

import factory_method.device.Device;
import vo.PC;
import vo.Phone;
import vo.TV;

public class DeviceBuilder {
	private String kind;
	private String model;
	private String serial;
	private String alias;
	
	private DeviceBuilder() {}
	
	public static DeviceBuilder a() {
		return new DeviceBuilder();
	}

	public DeviceBuilder setModel(String model) {
		this.model = model;
		return this;
	}

	public DeviceBuilder setSerial(String serial) {
		this.serial = serial;
		return this;
	}

	public DeviceBuilder setAlias(String alias) {
		this.alias = alias;
		return this;
	}
	
	public DeviceBuilder setKind(String kind) {
		this.kind = kind;
		return this;
	}
	
	public Device build() {
		if(kind == null || model == null || serial == null) {
			throw new RuntimeException("You must set kind, model, serial.");
		}
		if(alias == null) {
			alias = model;
		}
		switch(kind) {
		case "Phone":
			return new Phone(model, serial, alias);
		case "PC":
			return new PC(model, serial, alias);
		case "TV":
			return new TV(model, serial, alias);
		default:
			throw new RuntimeException("Kind is incorrect.");	
		}
	}
}
