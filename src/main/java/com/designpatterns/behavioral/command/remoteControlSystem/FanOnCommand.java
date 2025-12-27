package com.designpatterns.behavioral.command.remoteControlSystem;

public class FanOnCommand implements Command{

    private final Fan fan;

    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.turnOn();
    }
}
