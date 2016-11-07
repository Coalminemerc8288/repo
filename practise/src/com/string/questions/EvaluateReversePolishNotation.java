package com.string.questions;

import java.util.Stack;

/**
 *  Question: 
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation. Valid operators are +, -, *, /.
 * Each operand may be an integer or another expression. For example:
 * ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
 * ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 *
 * Best Solution: O(1) space and O(n) time
 *
 *
 * Tips & Tricks:
 * 1. Iterate through the string array(tokens) and check if contains operators.
 * 2. If contains operators then pop the last two value out of stack do the calculation and push back to stack
 * 3. If contains numbers just simply add them to the  stack.
 */
public class EvaluateReversePolishNotation {

    public static void main(String [] args) {
        String [] tokens = new String [] {"2", "1", "+", "3", "*"};
        System.out.println(evaluateRPN(tokens));
    }

    public static int evaluateRPN (String [] tokens) {

        int returnValue = 0;

        String operators = "+-*/";

        Stack<String> stack = new Stack<>();

        for (String s : tokens) {
            if (!operators.contains(s)) {
                stack.push(s);
            } else {
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());
                switch (s) {
                    case "+":
                        stack.push(String.valueOf(a + b));
                        break;

                    case "-":
                        stack.push(String.valueOf(a - b));
                        break;

                    case "*":
                        stack.push(String.valueOf(a * b));
                        break;

                    case "/":
                        stack.push(String.valueOf(a / b));
                        break;
                }
            }
        }
        returnValue = Integer.valueOf(stack.pop());
        return returnValue;
    }
}
