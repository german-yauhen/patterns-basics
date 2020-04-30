package com.herman.behavior.mediator.command;

import com.herman.behavior.mediator.LightsMediator;

public class TurnOnLightsCommand implements Command {

    private LightsMediator lightsMediator;

    public TurnOnLightsCommand(LightsMediator lightsMediator) {
        this.lightsMediator = lightsMediator;
    }

    @Override
    public void execute() {
        if (lightsMediator != null) {
            lightsMediator.turnOnLights();
        }
    }
}
