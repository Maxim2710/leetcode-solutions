package Easy;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }

        return stack.isEmpty();

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lineWithParentheses = scanner.nextLine();

        ValidParentheses validParentheses = new ValidParentheses();

        boolean result = validParentheses.isValid(lineWithParentheses);

        System.out.println(result);

        scanner.close();
    }
}
