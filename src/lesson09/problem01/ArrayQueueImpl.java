package lesson09.problem01;

import java.util.Arrays;

public class ArrayQueueImpl {
    private int[] arr = new int[4];
    private int front = -1;
    private int rear = 0;
    private int count = 0;

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return rear == arr.length;
    }

    public int size() {
        return count;
    }

    public void enqueue(int item) {
        if (isFull()) {
            resize();
        }
        arr[rear++] = item;
        count++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        int data = arr[++front];
        arr[front] = 0;
        count--;
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return arr[front + 1];
    }

    public void resize() {
        System.out.println("Resizing...");
        int length = arr.length;
        int resizedLength = length * 2;
        int[] resizedArr = new int[resizedLength];
        System.arraycopy(arr, 0, resizedArr, 0, length);
        arr = resizedArr;
    }

    public static void main(String[] args) {
        ArrayQueueImpl q = new ArrayQueueImpl();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        System.out.println(Arrays.toString(q.arr));
        System.out.println("Front: " + q.front);
        System.out.println("Rear: " + q.rear);
        System.out.println("Size: " + q.size());

        q.enqueue(5);
        System.out.println(Arrays.toString(q.arr));
        System.out.println("Front: " + q.front);
        System.out.println("Rear: " + q.rear);
        System.out.println("Size: " + q.size());

        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(8);
        q.enqueue(9);
        q.dequeue();
        System.out.println(Arrays.toString(q.arr));
        System.out.println("Front: " + q.front);
        System.out.println("Rear: " + q.rear);
        System.out.println("Size(): " + q.size());
        System.out.println("Peek(): " + q.peek());
        System.out.println("isFull(): " + q.isFull());
        System.out.println("isEmpty(): " + q.isEmpty());
    }
}
