package com.herman.behavior.template;

import com.herman.behavior.template.builder.ComputerBuilder;
import com.herman.behavior.template.builder.HiEndComputerBuilder;
import com.herman.behavior.template.builder.StandardDesktopComputerBuilder;

public class TemplateRunner {
    public static void main(String[] args) {
        ComputerBuilder standardComputerBuilder = new StandardDesktopComputerBuilder();
        standardComputerBuilder.buildComputer();

        ComputerBuilder hiEndComputerBuilder = new HiEndComputerBuilder();
        hiEndComputerBuilder.buildComputer();

        standardComputerBuilder.getComputerParts()
                .forEach((part, description) -> System.out.println("Standard::" + part + "::" + description));

        hiEndComputerBuilder.getComputerParts()
                .forEach((part, description) -> System.out.println("HiEnd::" + part + "::" + description));
    }
}
