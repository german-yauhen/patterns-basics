package com.herman.behavior.template.builder;

import com.herman.behavior.template.Computer;
import com.herman.behavior.template.ComputerPart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Template
 */
public abstract class ComputerBuilder {

    protected String computerName;
    protected Map<ComputerPart, String> computerParts = new HashMap<>();
    protected Map<ComputerPart, List<String>> computerPartStatuses = new HashMap<>();

    /**
     * Template method
     */
    public final Computer buildComputer() {
        setComputerName();

        addMotherBoard();
        setupMotherBoard();

        addProcessor();
        setupProcessor();

        return new Computer(computerParts);
    }

    abstract void setComputerName();
    abstract void addMotherBoard();
    abstract void setupMotherBoard();
    abstract void addProcessor();
    abstract void setupProcessor();

    public Map<ComputerPart, String> getComputerParts() {
        return Collections.unmodifiableMap(computerParts);
    }

    public Map<ComputerPart, List<String>> getComputerPartStatuses() {
        return Collections.unmodifiableMap(computerPartStatuses);
    }

    public List<String> getComputerPartStatuses(ComputerPart computerPart) {
        return Collections.unmodifiableList(computerPartStatuses.get(computerPart));
    }

    protected void setComputerPartStatus(ComputerPart computerPart, String status) {
        computerPartStatuses.getOrDefault(computerPart, new ArrayList<>()).add(status);
        System.out.println(computerName + "::" + computerPart + "::" + status);
    }
}
