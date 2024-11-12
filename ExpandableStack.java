public class ExpandableStack {
   
    private char[] stackArray;
    private int topIndex;

    // Constructor initializes stack with a size of 2 and sets the top index to -1
    public ExpandableStack() {
        stackArray = new char[2];
        topIndex = -1;
    }

    // Pushes a character onto the stack, expanding if the stack is full
    public void push(char c) {
        if (isFull()) {
            System.out.println("Stack is full; its current size is " + stackArray.length);
            expandStack();
        }
        stackArray[++topIndex] = c;
    }

    // Pops the top character from the stack; throws an exception if empty
    public char pop() {
        if (isEmpty()) {
            throw new RuntimeException("Cannot pop: Stack is empty");
        }
        return stackArray[topIndex--];
    }

    // Returns the character at the top without removing it; throws an exception if empty
    public char top() {
        if (isEmpty()) {
            throw new RuntimeException("Cannot retrieve top: Stack is empty");
        }
        return stackArray[topIndex];
    }

    // Returns the current number of elements in the stack
    public int size() {
        return topIndex + 1;
    }

    // Checks if the stack is empty
    public boolean isEmpty() {
        return topIndex == -1;
    }

    // Checks if the stack is full
    public boolean isFull() {
        return topIndex == stackArray.length - 1;
    }

    // Expands the stack to double its current capacity and copies elements over
    private void expandStack() {
        int newSize = stackArray.length * 2;
        System.out.println("Will be expanding the size to " + newSize);
        char[] newStack = new char[newSize];
        System.arraycopy(stackArray, 0, newStack, 0, stackArray.length);
        stackArray = newStack;
    }
}

