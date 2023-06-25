/* Implement a stack using an array in Java. Include the necessary methods such as push, pop, and isEmpty. */


// import java.io.*;
import java.util.NoSuchElementException;
import java.util.Queue;

public class queueQ<T> {

    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node front;
    private Node rear;

    public queueQ() {
        front = null;
        rear = null;
    }

    public void enqueue(T data) {
        Node newNode = new Node(data);
        if (front == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public T dequeue() {
        if (front == null) {
            throw new NoSuchElementException("queue is empty");
        }

        T data = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return data;
    }

    public boolean isEmpty() {
        return front == null;
    }
}