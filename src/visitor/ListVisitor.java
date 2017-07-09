package visitor;

import java.util.Iterator;

import visitor.composite.Device;
import visitor.composite.Entity;
import visitor.composite.Group;

public class ListVisitor implements Visitor {
	private String curRoom = "";
	private int level = 0;
	@Override
	public void visit(Group group) {
		printPadding();
		System.out.println("In room : " + curRoom + "//" + group);
		Iterator<Entity> iter = group.iterator();
		curRoom = group.getAlias();
		level++;
		while(iter.hasNext()) {
			iter.next().accept(this);
		}
		level--;
	}

	@Override
	public void visit(Device device) {
		printPadding();
		System.out.println(device);
	}

	private void printPadding() {
		for(int index = 0; index < level; index++) {
			System.out.print("  ");
		}
	}
}
