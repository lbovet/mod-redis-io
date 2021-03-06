package com.jetdrone.vertx.mods.redis.reply;

import java.io.IOException;
import java.nio.charset.Charset;

import org.jboss.netty.buffer.ChannelBuffer;

public class StatusReply implements Reply<String> {
    public static final char MARKER = '+';
    private final String status;

    public StatusReply(String status) {
        this.status = status;
    }

    @Override
    public String data() {
        return status;
    }

    @Override
    public ReplyType getType() {
        return ReplyType.Status;
    }

    @Override
    public boolean isPubSubMessage() {
        return false;
    }
}
