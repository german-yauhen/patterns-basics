package com.herman.behavior.interpreter;

import java.util.ArrayList;
import java.util.List;

public class AndExpression implements Expression {

    private List<Expression> expressions;

    public AndExpression() {
        this.expressions = new ArrayList<>();
    }

    public AndExpression(List<Expression> expressions) {
        this();
        this.expressions.addAll(expressions);
    }

    public AndExpression applyExpression(Expression expression) {
        if (this.expressions == null) {
            this.expressions = new ArrayList<>();
        }
        this.expressions.add(expression);
        return this;
    }

    @Override
    public boolean interpret(String context) {
        return this.expressions.stream()
                .allMatch(expression -> expression.interpret(context));
    }
}
