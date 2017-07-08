package template_method;

import org.junit.Test;

import iterator.Iterator;
import iterator.list.MyList;
import vo.PC;
import vo.Phone;

public class TemplateMethodTest {
	@Test
	public void test() throws Exception {
		SafePowerOffDevice pc1 = new PC("PC", "1");
		SafePowerOffDevice pc2 = new PC("PC", "2");
		SafePowerOffDevice phone1 = new Phone("PHONE", "11");
		SafePowerOffDevice phone2 = new Phone("PHONE", "12");
		
		MyList<SafePowerOffDevice> list = new MyList<>();
		list.add(pc1).add(pc2).add(phone1).add(phone2);
		Iterator<SafePowerOffDevice> iter = list.iterator();
		while(iter.hasNext()) {
			SafePowerOffDevice cur = iter.next();
			cur.powerOn();
		}
		
		iter = list.iterator();
		while(iter.hasNext()) {
			SafePowerOffDevice cur = iter.next();
			cur.safePowerOff();
		}
	}
}