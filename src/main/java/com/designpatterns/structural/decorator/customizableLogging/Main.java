package com.designpatterns.structural.decorator.customizableLogging;

public class Main {
    public static void main(String[] args) {

        Logger logger = new SimpleLogger();

        Logger decoratedLogger =
                new TimestampLogger(
                        new ErrorLevelLogger(
                                new FileLogger(logger)
                        )
                );

        decoratedLogger.log("System failure detected");
    }
}
