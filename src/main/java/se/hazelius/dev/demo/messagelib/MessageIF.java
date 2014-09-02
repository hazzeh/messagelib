package se.hazelius.dev.demo.messagelib;

public interface MessageIF {
    public long   getToken(long seed);
    public String getMessage(long token);
    public String getMessageQuoted(long token);
    public String getVersion();
}
