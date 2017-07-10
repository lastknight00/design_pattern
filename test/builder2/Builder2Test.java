package builder2;
import static org.junit.Assert.*;

import org.junit.Test;

import factory_method.device.Device;
import vo.Phone;

public class Builder2Test {

	@Test(expected=RuntimeException.class)
	public void testExceptionIncorrectKind() {
		DeviceBuilder.a()
					.setAlias("Alias")
					.setKind("xxxx")
					.setModel("Model")
					.setSerial("Serial")
					.build();
	}
	
	@Test(expected=RuntimeException.class)
	public void testExceptionNullKind() {
		DeviceBuilder.a()
				.setAlias("Alias")
				.setModel("Model")
				.setSerial("Serial")
				.build();
	}
	
	@Test(expected=RuntimeException.class)
	public void testExceptionNullModel() {
		DeviceBuilder.a()
				.setAlias("Alias")
				.setKind("Kind")
				.setSerial("Serial")
				.build();
	}

	@Test(expected=RuntimeException.class)
	public void testExceptionNullSerial() {
		DeviceBuilder.a()
					.setAlias("Alias")
					.setKind("xxxx")
					.setModel("Model")
					.build();
	}
	
	@Test
	public void testExceptionNullAlias() {
		Device device = DeviceBuilder.a()
									.setKind("Phone")
									.setModel("Model")
									.setSerial("Serial")
									.build();
		assertEquals("Model", device.getModel());
		assertEquals("Serial", device.getSerial());
		assertEquals("Model", device.getAlias());
		assertTrue(device instanceof Phone);
	}
	
	@Test
	public void testNormal() {
		Device device = DeviceBuilder.a()
									.setKind("Phone")
									.setAlias("Alias")
									.setModel("Model")
									.setSerial("Serial")
									.build();
		assertEquals("Model", device.getModel());
		assertEquals("Serial", device.getSerial());
		assertEquals("Alias", device.getAlias());
		assertTrue(device instanceof Phone);
	}
}
