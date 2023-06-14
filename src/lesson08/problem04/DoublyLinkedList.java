package lesson08.problem04;

public class DoublyLinkedList {

    Node header;

    DoublyLinkedList() {
        header = new Node();
    }

    //adds to the end of the list
    public void addLast(String item) {
        //implement

        Node lastNode = header;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }

        Node toAdd = new Node();
        toAdd.value = item;
        toAdd.previous = lastNode;
        lastNode.next = toAdd;
    }

    public boolean remove(String item) {
        Node last = header;

        while (last != null && last.value != item) {
            last = last.next;
        }

        if (last == null) return false;

        Node prev = last.previous;
        Node next = last.next;
        prev.next = next;

        if (next != null) {
            next.previous = prev;
        }
        return true;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        toString(sb, header);
        return sb.toString();
    }

    private void toString(StringBuilder sb, Node n) {
        if (n == null) return;
        if (n.value != null) sb.append(" " + n.value);
        toString(sb, n.next);
    }

    class Node {
        String value;
        Node next;
        Node previous;

        public String toString() {
            return value == null ? "null" : value;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast("Bob");
        list.addLast("Harry");
        list.addLast("Steve");
        System.out.println(list);
        System.out.println(list.remove("X"));
        System.out.println(list);
        System.out.println(list.remove("Bob"));
        System.out.println(list);
        System.out.println(list.remove("Steve"));
        System.out.println(list);
        System.out.println(list.remove("Harry"));
        System.out.println(list);
    }
}
