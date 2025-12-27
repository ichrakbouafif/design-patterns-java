package com.designpatterns.structural.decorator.customizableLogging;

public class ErrorLevelLogger extends LoggerDecorator{
    public ErrorLevelLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void log(String message) {
        super.log("[ERROR] " + message);
    }
}
