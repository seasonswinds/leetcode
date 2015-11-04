package xubai.leetcode.string;

import java.util.Stack;

/**
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * 
 * Valid operators are +, -, *, /. Each operand may be an integer or another expression.
 * 
 * Some examples:
 * 
 * ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
 * 
 * ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 * 
 * Created by xubai on 15/11/4.
 */
public class EvaluateReversePolishNotation {
    /**
     * 预先定义一个操作符字符串，根据indexOf方法返回值来判断是哪种运算，或者是数字。
     *
     * @param tokens
     * @return
     */
    public int evaluateReversePolishNotation(String[] tokens) {
        String operator = "+-*/";
        Stack<Integer> stack = new Stack<Integer>();
        for (String token : tokens) {
            int index = operator.indexOf(token);
            switch (index) {
                case 0:
                    stack.push(stack.pop() + stack.pop());
                    break;
                case 1:
                    stack.push(-stack.pop() + stack.pop());
                    break;
                case 2:
                    stack.push(stack.pop() * stack.pop());
                    break;
                case 3:
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b / a);
                    break;
                default:
                    stack.push(Integer.parseInt(token));
            }
        }
        int result = 0;
        if (stack.size() == 1) {
            result = stack.pop();
        }
        return result;
    }
}
