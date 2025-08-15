package lifoqueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class LIFOQueue {
    private Deque<Integer> stack;

    public LIFOQueue() {
        stack = new ArrayDeque<>();
    }

    
    public void push(int item) {
        stack.push(item); 
    }

   
    public int pop() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return stack.pop();
    }

    
    public int peek() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return stack.peek();
    }

    
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        LIFOQueue lifo = new LIFOQueue();

        lifo.push(10);
        lifo.push(20);
        lifo.push(30);

        System.out.println("Top element: " + lifo.peek()); // 30
        System.out.println("Popped: " + lifo.pop());       // 30
        System.out.println("Top element after pop: " + lifo.peek()); // 20
    }
}
