package lesson06;

public class Main {
    public static void main(String[] args) {
        MyTable t = new MyTable();
        t.add('a', "Andrew");
        t.add('b', "Billy");
        t.add('c', "Charlie");
        t.add('w', "Willie");

        String s = t.get('b');
        System.out.println(s);

        s = t.get('w');
        System.out.println(s);

        System.out.println(t);
    }
}
