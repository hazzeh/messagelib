package demolib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class DemoLibIT {
	@Before
	public void beforeMethod() {
		assertTrue("Native lib needs to be loaded for tests",canLoadNativeLib());
	}
	private boolean canLoadNativeLib() {
		try{
			new DemoLib();
			return true;
		}catch (UnsatisfiedLinkError e){
			return false;
		}
	}
	@Test
	public void getMessageQuotedShouldQuoteMessageNo10() throws Exception{
		DemoLib demoLib = new DemoLib();
		String messageQuoted = demoLib.getMessageQuoted(10);
		assertEquals("do_or_do_not_there_is_no_try", messageQuoted);
	}

	@Test
	public void getMessageQuotedShouldQuoteMessageNo20() throws Exception{
		DemoLib demoLib = new DemoLib();
		String messageQuoted = demoLib.getMessageQuoted(20);
		assertEquals("judge_me_by_my_size_do_you", messageQuoted);
	}
}
