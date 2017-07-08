package template_method.device;

import area.House;
import template_method.framework.Factory;
import vo.TV;

public class TVFactory extends Factory {

	@Override
	protected Device createDevice(String model, String serial, String alias) {
		Device device = new TV(model, serial, alias);
		System.out.printf("%s TV is created\n", device.getAlias());
		
		return device;
	}

	@Override
	protected void registerDevice(Device device, String room) {
		if(room == null) {
			House.add(device);
		} else {
			House.add(room, device);
		}
		System.out.printf("%s TV is put in %s.\n", device.getAlias(), room == null ? "house" : room);
	}
	
}
