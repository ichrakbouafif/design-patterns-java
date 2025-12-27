package com.designpatterns.structural.decorator.customizableLogging;

public class FileLogger extends LoggerDecorator{

    public FileLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void log(String message) {
        super.log("[File] " + message);
    }
}
