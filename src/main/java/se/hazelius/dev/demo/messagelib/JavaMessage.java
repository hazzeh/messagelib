package se.hazelius.dev.demo.messagelib;

public class JavaMessage implements MessageIF {

	@Override
	public long getToken(long seed) {
		return 0;
	}
	@Override
	public String getMessage(long token) {
		return "Hello World";
	}
	@Override
	public String getMessageQuoted(long token) {
		// TODO Auto-generated method stub
		return ""+token;
	}

}
