package visitor;

import visitor.composite.Device;
import visitor.composite.Group;

public class EntityVisitor implements Visitor {

	@Override
	public void visit(Group group) {
	}

	@Override
	public void visit(Device device) {
	}

}
