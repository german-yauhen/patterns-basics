package com.herman.behavior.mediator.model;

public class Light {

    private String name;
    private boolean isOn;

    private Light() {
    }

    public Light(String name) {
        this.name = name;
        this.isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public boolean isOff() {
        return !isOn;
    }

    public void toggle() {
        String action = isOn ? "off" : "on";
        System.out.println("Switching " + action + " the " + name + " light...");
        if (isOn) {
            isOn = false;
        } else {
            isOn = true;
        }
        System.out.println("The " + name + " lights is switched " + action);
    }

}
