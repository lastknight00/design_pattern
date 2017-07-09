package visitor.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import visitor.Visitor;

public class Group extends Entity {
	private final List<Entity> list;
	private final String alias;
	
	public Group(String alias) {
		this.alias = alias;
		this.list = new ArrayList<>();
	}

	@Override
	public int getDeviceNum() {
		int deviceNum = 0;
		for(Entity entity : list) {
			deviceNum += entity.getDeviceNum();
		}
		return deviceNum;
	}

	@Override
	public Entity add(final Entity entity) {
		list.add(entity);
		return this;
	}
	
	@Override
	public List<Entity> getList() {
		return list;
	}
	@Override
	public String getAlias() {
		return alias;
	}

	@Override
	public String toString() {
		return "[Group] " +  alias + ", Size : " + list.size();
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public Iterator<Entity> iterator() {
		return list.iterator();
	}
}
