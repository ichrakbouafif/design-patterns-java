package com.designpatterns.structural.decorator.customizableLogging;

public abstract class LoggerDecorator implements Logger{
    protected Logger logger;

    protected LoggerDecorator(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void log(String message) {
        logger.log(message);
    }
}
