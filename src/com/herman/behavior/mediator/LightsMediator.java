package com.herman.behavior.mediator;

import com.herman.behavior.mediator.model.Light;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class LightsMediator {

    private List<Light> lights = new ArrayList<>();

    public void registerLights(Light... lights) {
        Collections.addAll(this.lights, lights);
    }

    public void turnOnLights() {
        toggleLightsIf(Light::isOff);
    }

    public void turnOffLights() {
        toggleLightsIf(Light::isOn);
    }

    private void toggleLightsIf(Predicate<Light> condition) {
        lights.stream()
                .filter(condition)
                .forEach(Light::toggle);
    }

}
