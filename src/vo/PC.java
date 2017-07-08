package vo;

import template_method.SafePowerOffDevice;

public class PC extends SafePowerOffDevice {

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

	@Override
	protected void preprocessPowerOff() {
		System.out.println("실행중인 프로그램을 종료합니다.");
	}

}
