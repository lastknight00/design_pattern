package visitor;

import visitor.composite.Device;
import visitor.composite.Group;

public interface Visitor {
	public void visit(Group group);
	public void visit(Device device);
}
