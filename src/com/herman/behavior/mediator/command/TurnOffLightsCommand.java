package com.herman.behavior.mediator.command;

import com.herman.behavior.mediator.LightsMediator;

public class TurnOffLightsCommand implements Command {

    private LightsMediator lightsMediator;

    public TurnOffLightsCommand(LightsMediator lightsMediator) {
        this.lightsMediator = lightsMediator;
    }

    @Override
    public void execute() {
        if (lightsMediator != null) {
            lightsMediator.turnOffLights();
        }
    }
}
