package lesson09.problem02;


public class DoublyLinkedListStack {
    Node top;
    private int count;

    DoublyLinkedListStack() {
        top = new Node();
        count = 0;
    }

    public void push(Object item) {
        Node toAdd = new Node();
        toAdd.value = item;
        top.next = toAdd;
        toAdd.previous = top;
        top = toAdd;
        count++;
    }

    public Object pop() {
        if (isEmpty()) return null;

        Node value = top;
        top = top.previous;
        top.next = null;
        count--;
        return value;
    }

    public boolean isEmpty() {
        return (count == 0);
    }

    public int size() {
        return count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        toString(sb, top);
        return sb.toString();
    }

    private void toString(StringBuilder sb, Node n) {
        if (n == null) return;
        if (n.value != null) sb.append(n);
        toString(sb, n.previous);
    }

    class Node {
        Object value;
        Node next;
        Node previous;

        public String toString() {
            return value == null ? "null" : "|" + value.toString() + "|";
        }
    }

    public static void main(String[] args) {
        DoublyLinkedListStack stack = new DoublyLinkedListStack();
        stack.push("Bob");
        stack.push("Harry");
        stack.push("Steve");
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("Is empty: " + stack.isEmpty());
        stack.push("Bevan");
        stack.push("Michel");
        System.out.println(stack);
        System.out.println("Size: " + stack.size());
    }
}
