package com.herman.behavior.mediator;

import com.herman.behavior.mediator.command.TurnOffLightsCommand;
import com.herman.behavior.mediator.command.TurnOnLightsCommand;
import com.herman.behavior.mediator.model.Light;

public class MediatorRunner {
    public static void main(String[] args) {
        Light kitchen = new Light("Kitchen");
        Light bedroom = new Light("Bedroom");
        Light guest = new Light("Guest");

        LightsMediator lightsMediator = new LightsMediator();
        lightsMediator.registerLights(kitchen, bedroom, guest);

        TurnOnLightsCommand turnOnLightsCommand = new TurnOnLightsCommand(lightsMediator);
        TurnOffLightsCommand turnOffLightsCommand = new TurnOffLightsCommand(lightsMediator);

        turnOnLightsCommand.execute();

        bedroom.toggle();

        turnOffLightsCommand.execute();
    }
}
