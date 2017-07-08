package area;

import java.util.HashMap;
import java.util.Map;

import iterator.list.MyList;
import template_method.device.Device;

public class House {
	public static Map<String, Room> rooms;
	public static MyList<Device> deviceList;
	static {
		rooms = new HashMap<>();
		deviceList = new MyList<>();
	}
	public static Class add(String room, Device device) {
		if(!rooms.containsKey(room)) {
			rooms.put(room, new Room(room));
		}
		rooms.get(room).add(device);
		return House.class;
	}
	
	public static Class add(Device device) {
		deviceList.add(device);
		return House.class;
	}
	
	public static Room getRoom(String room) {
		Room retval = rooms.get(room);
		return retval == null ? new Room(room) : retval;
	}
}
