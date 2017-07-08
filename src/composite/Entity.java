package composite;

import java.util.List;

public abstract class Entity {
	public abstract int getDeviceNum();
	public abstract String getAlias();
	
	public Entity add(final Entity group) {
		return null;
	};
	
	public List<Entity> getList() {
		return null;
	};
	
	public abstract void print(int level);
}
