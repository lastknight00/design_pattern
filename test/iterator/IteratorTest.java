package iterator;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import iterator.list.MyList;
import template_method.device.Device;
import vo.Phone;
import vo.TV;

public class IteratorTest {
	@Test
	public void test() {
		MyList<Device> list = new MyList<>();
		list.addAll(Arrays.asList(new Phone("test1", "S8"), new TV("test2", "Note7")));
		assertEquals(list.get(0).getModel(), "test1");
		Iterator<Device> iter = list.iterator();
		int index = 0;
		while(iter.hasNext()) {
			Device device = iter.next();
			assertEquals(device.getModel(), list.get(index).getModel());
			assertTrue(device.powerOn());
			assertTrue(device.powerOff());
			assertFalse(device.powerOff());
			index++;
		}
	}

}
