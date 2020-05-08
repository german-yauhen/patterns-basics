package com.herman.behavior.template.builder;

import com.herman.behavior.template.ComputerPart;

public class HiEndComputerBuilder extends ComputerBuilder {

    @Override
    void setComputerName() {
        computerName = "HiEnd";
    }

    @Override
    void addMotherBoard() {
        computerParts.put(ComputerPart.MOTHERBOARD, "Hi-End computer Motherboard");
    }

    @Override
    void setupMotherBoard() {
        setComputerPartStatus(ComputerPart.MOTHERBOARD, "Screwing the Hi-End motherboard to the case.");
        setComputerPartStatus(ComputerPart.MOTHERBOARD, "Pair Hi-End motherboard with special power supplier.");
        setComputerPartStatus(ComputerPart.MOTHERBOARD, "Hi-End motherboard successfully set up.");
    }

    @Override
    void addProcessor() {
        computerParts.putIfAbsent(ComputerPart.PROCESSOR, "Hi-End Processor for desktop computer.");
    }

    @Override
    void setupProcessor() {
        setComputerPartStatus(ComputerPart.PROCESSOR, "Pair Hi-End Processor with special bust power supplier.");
        setComputerPartStatus(ComputerPart.PROCESSOR, "Hi-End Processor successfully set up.");
    }
}
