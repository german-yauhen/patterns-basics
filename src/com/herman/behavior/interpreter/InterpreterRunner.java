package com.herman.behavior.interpreter;

import java.util.Arrays;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression terminalExpressionForLion = new TerminalExpression("lion");
        Expression terminalExpressionForTiger = new TerminalExpression("tiger");
        Expression terminalExpressionForBear = new TerminalExpression("bear");

        AndExpression andExpression = new AndExpression(
                Arrays.asList(terminalExpressionForTiger, terminalExpressionForBear)
        );
        
        Expression orExpression = OrExpression.builder()
                .withExpression(terminalExpressionForLion)
                .withExpression(andExpression)
                .build();

        System.out.println(orExpression.interpret("Vegetarian Lion with jumping Tiger and drinking Bear"));
    }
}
