package visitor.composite;

import visitor.Visitor;

public class PC extends Device {

	public PC(String model, String serial) {
		super(model, serial);
	}
	
	public PC(String model, String serial, String alias) {
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
		System.out.printf("%s(%s) phone power on\n", alias, model);
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
		System.out.printf("%s(%s) phone power off\n", alias, model);
	}

}
