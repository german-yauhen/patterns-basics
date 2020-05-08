package com.herman.behavior.template;

import java.util.Collections;
import java.util.Map;

public class Computer {

    private Map<ComputerPart, String> computerParts;

    public Computer(Map<ComputerPart, String> computerParts) {
        this.computerParts = computerParts;
    }

    public Map<ComputerPart, String> getComputerParts() {
        return Collections.unmodifiableMap(computerParts);
    }

    public void addComputerPart(ComputerPart computerPart, String computerPartDescription) {
        computerParts.putIfAbsent(computerPart, computerPartDescription);
    }

}
