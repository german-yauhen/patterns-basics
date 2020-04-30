package com.herman.behavior.command;

import java.util.Arrays;

public class CommandRunner {
    public static void main(String[] args) {
        Light guestRoomLight = new Light("guestroom");
        Light kitchenLight = new Light("kitchen");
        Light bathRoomLight = new Light("bathroom");

        Command toggleGuestRoomLightCommand = new ToggleLightCommand(guestRoomLight);
        Switch lightSwitcher = new Switch();

        lightSwitcher.storeAndExecute(toggleGuestRoomLightCommand);

        Command toggleAllRoomLightsCommand = new SwithOffLightsCommand(
                Arrays.asList(guestRoomLight, kitchenLight, bathRoomLight)
        );

        lightSwitcher.storeAndExecute(toggleAllRoomLightsCommand);
    }
}
