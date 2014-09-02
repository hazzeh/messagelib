package se.hazelius.dev.demo.messagelib;

import static org.junit.Assert.*;

import org.junit.Test;

public class MessageLibTest {

	@Test
	public void getMessageShouldReturnNoCoffeeWithInvalidToken(){
		JavaMessage messagelib = new JavaMessage();
		String message = messagelib.getMessage(29);
		assertEquals("No coffee for you!", message);
	}
	@Test
	public void getMessageShouldReturnValueFromMapWithValidToken(){
		JavaMessage messagelib = new JavaMessage();
		String message = messagelib.getMessage(10);
		assertEquals("Should I kill myself, or have a cup of coffee?", message);
	}
	@Test
	public void getTokenShouldReturn10WithSeed9() throws Exception {
		JavaMessage mlib = new JavaMessage();
		assertEquals(10,mlib.getToken(9));
	}
	@Test
	public void getTokenShouldReturn10WithSeed10() throws Exception {
		JavaMessage mlib = new JavaMessage();
		assertEquals(10,mlib.getToken(10));
	}
	@Test
	public void getTokenShouldReturn20WithSeed11() throws Exception {
		JavaMessage mlib = new JavaMessage();
		assertEquals(20,mlib.getToken(11));
	}
	@Test
	public void getTokenShouldReturn40WithSeed50() throws Exception {
		JavaMessage mlib = new JavaMessage();
		assertEquals(40,mlib.getToken(50));
	}

	@Test
	public void getMessageQuotedShouldRemoveNonAlphaCharacters() throws Exception{
		JavaMessage messagelib = new JavaMessage();
		String message = messagelib.getMessageQuoted(10);
		String quotedString="should_i_kill_myself_or_have_a_cup_of_coffee";
		assertEquals(quotedString, message);
	}
	@Test
	public void getVersionShouldReturn100(){
		JavaMessage messagelib = new JavaMessage();
		String version = messagelib.getVersion();
		assertEquals("1.0.0", version);
	}
}
