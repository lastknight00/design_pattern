package singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import composite.Entity;
import composite.Group;
import vo.PC;
import vo.Phone;
import vo.TV;

public class SingletonTest {
	@Test
	public void test() throws Exception {
		House house = House.getInstance();
		Entity rooms = house.getRooms();
		Entity room1 = new Group("room1");
		Entity room2 = new Group("room2");
		room1.add(new PC("PC2","2")).add(new TV("TV1","11"));
		room2.add(new Phone("PHONE1","21")).add(new TV("TV1","TV1")).add(new Phone("PHONE1","22"));
		rooms.add(room1).add(room2).add(new PC("PC1", "1"));
		rooms.print(0);
		assertEquals(6, rooms.getDeviceNum());
	}
}
