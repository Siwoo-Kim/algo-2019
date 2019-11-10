package siwoo.chapter3;

import java.util.Stack;

/**
 * Created by sm123tt@gmail.com on 2019-11-03
 * Project : algosiwoo
 * Github : http://github.com/Siwoo-Kim
 */

public class Evaluate {

    public static void main(String[] args) {
        Stack<Double> vals = new Stack<>();
        Stack<String> ops = new Stack<>();

        String[] sArray = "( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )".split(" ");
        for (int i=0; i<sArray.length; i++) {
            String s = sArray[i];
            if (s.equals("(")) ;
            else if (Operator.of(s) != null)
                ops.push(s);
            else if (s.equals(")")) {
                double v = vals.pop();
                double r = Operator.of(ops.pop())
                        .operate(vals.pop(), v);
                vals.push(r);
            } else
                vals.push(Double.parseDouble(s));
        }
        System.out.println(vals.pop());
    }
}



















