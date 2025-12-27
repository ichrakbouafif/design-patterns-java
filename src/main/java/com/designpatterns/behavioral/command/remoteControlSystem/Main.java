package com.designpatterns.behavioral.command.remoteControlSystem;

public class Main {
    public static void main(String[] args) {

        RemoteControl remote = new RemoteControl();

        Light livingRoomLight = new Light();
        Fan ceilingFan = new Fan();

        // Turn on the light
        remote.setCommand(new LightOnCommand(livingRoomLight));
        remote.pressButton();

        // Turn off the light
        remote.setCommand(new LightOffCommand(livingRoomLight));
        remote.pressButton();

        // Turn on the fan
        remote.setCommand(new FanOnCommand(ceilingFan));
        remote.pressButton();

        // Turn off the fan
        remote.setCommand(new FanOffCommand(ceilingFan));
        remote.pressButton();
    }
}
