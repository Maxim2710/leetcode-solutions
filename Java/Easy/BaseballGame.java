package Easy;

import java.util.Stack;

public class BaseballGame {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();

        for (String op : ops) {
            switch (op) {
                case "C" -> stack.pop();
                case "D" -> stack.push(stack.peek() * 2);
                case "+" -> {
                    int last = stack.pop();
                    int secondLast = stack.peek();
                    stack.push(last);

                    stack.push(last + secondLast);
                }
                default ->
                        stack.push(Integer.parseInt(op));
            }
        }

        int totalSum = 0;
        for (int score : stack) {
            totalSum += score;
        }

        return totalSum;
    }
}
