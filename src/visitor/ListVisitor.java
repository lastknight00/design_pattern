package visitor;

import java.util.Iterator;

import visitor.composite.Device;
import visitor.composite.Entity;
import visitor.composite.Group;

public class ListVisitor implements Visitor {

	@Override
	public void visit(Group group) {
		System.out.println(group);
		Iterator<Entity> iter = group.iterator();
		while(iter.hasNext()) {
			iter.next().accept(this);
		}
	}

	@Override
	public void visit(Device device) {
		System.out.println(device);
	}

}
