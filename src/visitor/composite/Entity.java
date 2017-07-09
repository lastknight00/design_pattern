package visitor.composite;

import java.util.List;

import visitor.Element;

public abstract class Entity extends Element {
	public abstract int getDeviceNum();
	public abstract String getAlias();
	
	public Entity add(final Entity group) {
		return null;
	};
	
	public List<Entity> getList() {
		return null;
	};
}
