package com.herman.behavior.command;

/**
 * Request
 */
public class Light {

    private boolean isOn;
    private String room;

    public Light(String room) {
        this.room = room;
    }

    public boolean isOn() {
        return isOn;
    }

    public void toggle() {
        System.out.printf("Switching %s the %s light...\n", isOn ? "off" : "on", room);
        if (isOn) {
            this.off();
        } else {
            this.on();
        }
    }

    private void on() {
        System.out.println("The light switched on.");
        this.isOn = true;
    }

    private void off() {
        System.out.println("The light switched off.");
        this.isOn = false;
    }
}
