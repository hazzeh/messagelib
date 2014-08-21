package se.hazelius.dev.demo.messagelib;

import static org.junit.Assert.*;

import org.junit.Test;

public class MessageLibTest {

    @Test
    public void testGetVersion() {
        MessageLib messagelib = new MessageLib();
        String version = messagelib.getVersion();
        assertEquals("1.0.0", version);
    }

    @Test
    public void getMessageShouldReturnHelloWorld(){
        MessageLib messagelib = new MessageLib();
        String message = messagelib.getMessage();
        assertEquals("Hello World", message);
    }
}
