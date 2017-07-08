package singleton;

import composite.Group;

public class House {
	private final static House house = new House();
	private final static Group rooms = new Group("rooms");
	private House() {
	}
	
	public static House getInstance() {
		return house;
	}
	
	public Group getRooms() {
		return rooms;
	}
}
