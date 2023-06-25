public class stackQ<T> {
    private int maxSize;
    private int top;
    private T[] stackQArray;

    public stackQ(int size) {
        maxSize = size;
        stackQArray = (T[]) new Object[maxSize];
        top = -1; // Initialize the top pointer to -1 (empty stack)
    }

    public void push(T value) {
        if (isFull()) {
            System.out.println("stack is full. Cannot push element.");
            return;
        }
        stackQArray[++top] = value;
        System.out.println("Pushed " + value + " into the stack.");
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("stack is empty. Cannot pop element.");
            return null;
        }
        T poppedValue = stackQArray[top--];
        System.out.println("Popped " + poppedValue + " from the stack.");
        return poppedValue;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        stackQ<Integer> stackQ = new stackQ<>(5);
        stackQ.push(10);
        stackQ.push(20);
        stackQ.push(30);
        stackQ.pop();
        stackQ.pop();
        stackQ.pop();
        stackQ.pop();
    }
}
