package siwoo.chapter3;

import java.util.EnumSet;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.toMap;

/**
 * Created by sm123tt@gmail.com on 2019-11-03
 * Project : algosiwoo
 * Github : http://github.com/Siwoo-Kim
 */

public enum Operator {
    PLUS ("+") {
        @Override
        double operate(double a, double b) {
            return a+b;
        }
    }, MINUS ("-") {
        @Override
        double operate(double a, double b) {
            return a-b;
        }
    }, MULTIPLY ("*") {
        @Override
        double operate(double a, double b) {
            return a * b;
        }
    }, DIVIDE ("/") {
        @Override
        double operate(double a, double b) {
            return a / b;
        }
    };

    public final String op;
    private static Map<String, Operator> ops = EnumSet.allOf(Operator.class)
            .stream()
            .collect(toMap(op -> op.op, Function.identity()));

    Operator(String op) {
        this.op = op;
    }

    public static Operator of(String op) {
        op = op.trim();
        return ops.get(op);
    }

    abstract double operate(double a, double b);
}
