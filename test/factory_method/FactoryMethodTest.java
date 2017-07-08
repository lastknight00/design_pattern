package factory_method;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import area.House;
import factory_method.device.Device;
import factory_method.device.PhoneFactory;
import factory_method.device.TVFactory;
import factory_method.framework.Factory;
import iterator.Iterator;

public class FactoryMethodTest {
	final static String TV_MODEL = "TV_MODEL";
	final static String PHONE_MODEL = "PHONE_MODEL";
	@Test
	public void test() {
		Factory phoneFactory = new PhoneFactory();
		Factory tvFactory = new TVFactory();
		Device[] deviceList = new Device[6];
		
		
		deviceList[0] = tvFactory.create(TV_MODEL, "1", "안방");
		deviceList[1] = tvFactory.create(TV_MODEL, "2", "거실");
		deviceList[2] = tvFactory.create(TV_MODEL, "3", "쪽방");
		deviceList[3] = phoneFactory.create(PHONE_MODEL, "11", "안방");
		deviceList[4] = phoneFactory.create(PHONE_MODEL, "12", "쪽방");
		deviceList[5] = phoneFactory.create(PHONE_MODEL, "13", "거실");
		
		Iterator<Device> iter = House.getRoom("안방").getDeviceList().iterator();
		Device curDevice = iter.next();
		assertEquals(TV_MODEL, curDevice.getModel());
		assertEquals("1", curDevice.getSerial());
		curDevice = iter.next();
		assertEquals(PHONE_MODEL, curDevice.getModel());
		assertEquals("11", curDevice.getSerial());
		
		iter = House.getRoom("거실").getDeviceList().iterator();
		curDevice = iter.next();
		assertEquals(TV_MODEL, curDevice.getModel());
		assertEquals("2", curDevice.getSerial());
		curDevice = iter.next();
		assertEquals(PHONE_MODEL, curDevice.getModel());
		assertEquals("13", curDevice.getSerial());
		
		iter = House.getRoom("쪽방").getDeviceList().iterator();
		curDevice = iter.next();
		assertEquals(TV_MODEL, curDevice.getModel());
		assertEquals("3", curDevice.getSerial());
		curDevice = iter.next();
		assertEquals(PHONE_MODEL, curDevice.getModel());
		assertEquals("12", curDevice.getSerial());
	}
}
