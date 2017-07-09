package adapter.delegate;

import adapter.Banner;

public class PrintBannerDelegate extends PrintClass {
	private Banner banner;
	
	public PrintBannerDelegate(String string) {
		this.banner = new Banner(string);
	}
	
	@Override
	public void printWeak() {
		banner.showWithParen();
	}

	@Override
	public void printStrong() {
		banner.showWithAster();
	}

}
