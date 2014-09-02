package se.hazelius.dev.demo.messagelib;

import java.util.HashMap;
import java.util.Map;

public class JavaMessage implements MessageIF {
	public static final String LIBVERSION = "1.0.0";
	Map<Long,String> messageMap = new HashMap<Long, String>();

	public JavaMessage() {
		messageMap.put(Long.valueOf(10),"Should I kill myself, or have a cup of coffee?");
		messageMap.put(Long.valueOf(20),"Coffee is a way of stealing time that should by rights belong to your older self.");
		messageMap.put(Long.valueOf(30), "Coffee first. Schemes later.");
	}
	@Override
	public long getToken(long seed) {
		if (seed<=10)
			return 10;
		else if (seed <= 20)
			return 20;
		else if (seed <= 30)
			return 30;
		else
		  return 40;
	}
	@Override
	public String getMessage(long token) {
		String string = messageMap.get(Long.valueOf(token));
		if (string != null){
			return string;
		}else{
			return "No coffee for you!";
		}
	}
	@Override
	public String getMessageQuoted(long token) {
		String message = messageMap.get(Long.valueOf(token));
		if (message == null){
			message="No coffee for you!";
		}
		String quotedMessage=message.toLowerCase();
		return createQuotedStringFromMessage(quotedMessage);
	}

	private String createQuotedStringFromMessage(String message){
		message=message.replaceAll("[,\\.\\!\\?]", "");
		message=message.replaceAll(" ", "_");
		return message;
	}
	@Override
	public String getVersion() {
		return LIBVERSION;
	}

}
