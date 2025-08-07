package DSA;

public class ArrayStack {
    int top;
    int[] stack;
    int capacity;

    // Constructor
    ArrayStack(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }

    // Push an element to the stack
    void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow!");
        } else {
            stack[++top] = x;
            System.out.println(x + " pushed to stack");
        }
    }

    // Pop the top element
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        } else {
            return stack[top--];
        }
    }

    // Peek the top element
    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stack[top];
        }
    }

    // Check if stack is empty
    boolean isEmpty() {
        return top == -1;
    }

    // Check if stack is full
    boolean isFull() {
        return top == capacity - 1;
    }

    // Display all elements
    void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    // Main method to test
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Top element is: " + stack.peek());

        System.out.println("Popped element is: " + stack.pop());

        stack.display();
    }
}

