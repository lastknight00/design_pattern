package visitor;
import org.junit.Test;

import visitor.composite.Entity;
import visitor.composite.Group;
import visitor.composite.PC;
import visitor.composite.Phone;
import visitor.composite.TV;

public class VisitorTest {

	@Test
	public void test() {
		Entity house = new Group("house");
		Entity room1 = new Group("room1");
		Entity room2 = new Group("room2");
		room1.add(new PC("PC2","2")).add(new TV("TV1","11"));
		room2.add(new Phone("PHONE1","21")).add(new TV("TV1","TV1")).add(new Phone("PHONE1","22"));
		house.add(room1).add(room2).add(new PC("PC1", "1"));
		house.accept(new ListVisitor());
	}
	

}
