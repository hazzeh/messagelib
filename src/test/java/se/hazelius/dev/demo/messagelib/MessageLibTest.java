package se.hazelius.dev.demo.messagelib;

import static org.junit.Assert.*;

import org.junit.Test;

public class MessageLibTest {

    @Test
    public void getMessageShouldReturnHelloWorld(){
        JavaMessage messagelib = new JavaMessage();
        String message = messagelib.getMessage(0);
        assertEquals("Hello World", message);
    }
}
