package com.herman.behavior.interpreter;

import java.util.ArrayList;
import java.util.List;

public class OrExpression implements Expression {

    private List<Expression> expressions;

    private OrExpression() {}

    @Override
    public boolean interpret(String context) {
        return expressions.stream()
                .anyMatch(expression -> expression.interpret(context));
    }

    public static OrExpressionBuilder builder() {
        return new OrExpressionBuilder();
    }

    public static final class OrExpressionBuilder {

        private List<Expression> expressions;

        private OrExpressionBuilder() {
            expressions = new ArrayList<>();
        }

        public OrExpressionBuilder withExpression(Expression expression) {
            this.expressions.add(expression);
            return this;
        }

        public OrExpression build() {
            OrExpression orExpression = new OrExpression();
            orExpression.expressions = this.expressions;
            return orExpression;
        }
    }

}
