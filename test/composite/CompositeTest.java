package composite;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import vo.PC;
import vo.Phone;
import vo.TV;

public class CompositeTest {

	@Test
	public void test() {
		Entity house = new Group("house");
		Entity room1 = new Group("room1");
		Entity room2 = new Group("room2");
		room1.add(new PC("PC2","2")).add(new TV("TV1","11"));
		room2.add(new Phone("PHONE1","21")).add(new TV("TV1","TV1")).add(new Phone("PHONE1","22"));
		house.add(room1).add(room2).add(new PC("PC1", "1"));
		house.print(0);
		assertEquals(6,  house.getDeviceNum());
	}
	

}
