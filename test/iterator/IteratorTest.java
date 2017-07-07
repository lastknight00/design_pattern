package iterator;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import iterator.list.MyList;
import iterator.vo.Device;
import iterator.vo.Phone;

public class IteratorTest {
	@Test
	public void test() {
		MyList<Device> list = new MyList<>();
		list.addAll(Arrays.asList(new Phone("test1", "S8"), new Phone("test2", "Note7")));
		assertEquals(list.get(0).getModel(), "test1");
		Iterator<Device> iter = list.iterator();
		int index = 0;
		while(iter.hasNext()) {
			assertEquals(iter.next().getModel(), list.get(index).getModel());
			index++;
		}
	}

}
