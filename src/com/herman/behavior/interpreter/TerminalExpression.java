package com.herman.behavior.interpreter;

import java.util.StringTokenizer;

public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String expression) {
        StringTokenizer stringTokenizer = new StringTokenizer(expression.toLowerCase());
        while (stringTokenizer.hasMoreTokens()) {
            if (stringTokenizer.nextElement().equals(data.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}
