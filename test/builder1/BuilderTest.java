package builder1;

import org.junit.Test;

public class BuilderTest {
	@Test
	public void testTextBuilder() {
		System.out.println(getResult(new TextBuilder()));
	}
	
	@Test
	public void testHtmlBuilder() throws Exception {
		System.out.println(getResult(new HTMLBuilder()));
	}
	
	private String getResult(Builder builder) {
		Director director = new Director(builder);
		director.construct();
		String result = builder.getResult();
		return result;
	}
}
