package com.herman.behavior.template.builder;

import com.herman.behavior.template.ComputerPart;

public class StandardDesktopComputerBuilder extends ComputerBuilder {

    @Override
    void setComputerName() {
        computerName = "Standard";
    }

    @Override
    void addMotherBoard() {
        computerParts.putIfAbsent(ComputerPart.MOTHERBOARD, "Standard Motherboard for desktop computer.");
    }

    @Override
    void setupMotherBoard() {
        setComputerPartStatus(ComputerPart.MOTHERBOARD, "Screwing the standard motherboard to the case.");
        setComputerPartStatus(ComputerPart.MOTHERBOARD, "Pluging in the power supply connectors.");
        setComputerPartStatus(ComputerPart.MOTHERBOARD, "Mother board successfully set up.");
    }

    @Override
    void addProcessor() {
        computerParts.putIfAbsent(ComputerPart.PROCESSOR, "Standard Processor for desktop computer.");
    }

    @Override
    void setupProcessor() {
        setComputerPartStatus(ComputerPart.PROCESSOR, "Processor successfully set up.");
    }
}
