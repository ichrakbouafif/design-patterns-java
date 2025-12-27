package com.designpatterns.structural.decorator.customizableLogging;

import java.time.LocalDateTime;

public class TimestampLogger extends LoggerDecorator{
    public TimestampLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void log(String message) {
        String timestampedMessage =
                "[" + LocalDateTime.now() + "] " + message;
        super.log(timestampedMessage);
    }
}
