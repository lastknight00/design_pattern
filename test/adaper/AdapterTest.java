package adaper;

import static org.junit.Assert.*;

import org.junit.Test;

import adapter.delegate.PrintBannerDelegate;
import adapter.inter.PrintBanner;

public class AdapterTest {
	@Test
	public void test() throws Exception {
		PrintBannerDelegate pbd = new PrintBannerDelegate("Print Test");
		pbd.printStrong();
		pbd.printWeak();
		
		PrintBanner pb = new PrintBanner("Print Test interface");
		pb.printStrong();
		pb.printWeak();
	}
}
