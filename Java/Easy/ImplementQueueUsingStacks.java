package Easy;

import java.util.Stack;

public class ImplementQueueUsingStacks {
    private Stack<Integer> inpStack;
    private Stack<Integer> outStack;

    public ImplementQueueUsingStacks() {
        inpStack = new Stack<>();
        outStack = new Stack<>();
    }

    public void push(int x) {
        inpStack.push(x);
    }

    public int pop() {
        if (outStack.isEmpty()) {
            while (!inpStack.isEmpty()) {
                outStack.push(inpStack.pop());
            }
        }

        return outStack.pop();
    }

    public int peek() {
        if (outStack.isEmpty()) {
            while (!inpStack.isEmpty()) {
                outStack.push(inpStack.pop());
            }
        }

        return outStack.peek();
    }

    public boolean empty() {
        return outStack.isEmpty() && inpStack.isEmpty();
    }
}
