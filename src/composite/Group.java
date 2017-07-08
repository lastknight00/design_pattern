package composite;

import java.util.ArrayList;
import java.util.List;

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
	public void print(final int level) {
		for(int index = 0; index < level; index++) System.out.print("    ");
		System.out.println(this);
		List<Entity> children = this.getList();
		if (children != null) {
			for (Entity child : children) {
				child.print(level + 1);
			}
		}
	}
	
}
