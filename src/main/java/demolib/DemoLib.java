package demolib;
import se.hazelius.dev.demo.messagelib.MessageIF;

public class DemoLib implements MessageIF {
	static {
		System.loadLibrary("demo");
	}
	@Override
	public native long getToken(long seed);
	@Override
	public native String getMessage(long token);
	@Override
	public native String getMessageQuoted(long token);
	@Override
	public native String getVersion();

}
