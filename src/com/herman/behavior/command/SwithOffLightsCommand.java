package com.herman.behavior.command;

import java.util.Collection;

public class SwithOffLightsCommand implements Command {

    private Collection<Light> lights;

    public SwithOffLightsCommand(Collection<Light> lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        for (Light light: lights) {
            if (light.isOn()) {
                light.toggle();
            }
        }
    }
}
