package lesson08.problem01;

import java.util.Arrays;

public class MyEmployeeList {
    private final int INITIAL_LENGTH = 4;
    private Person[] people;
    private int size;

    MyEmployeeList() {
        people = new Person[INITIAL_LENGTH];
        size = 0;
    }

    public void add(Person person) {
        if (person == null) return;
        if (size == people.length) resize();
        people[size++] = person;

    }

    public void insert(Person person, int pos) {
        if (pos > size || pos < 0) return;
        if (pos == people.length || size + 1 > people.length) resize();

        Person[] temp = new Person[people.length + 1];
        System.arraycopy(people, 0, temp, 0, people.length - pos);
        temp[pos] = person;

        System.arraycopy(people, pos, temp, pos + 1, people.length - pos);
        people = temp;
        ++size;
    }

    public boolean remove(Person person) {
        if (size == 0) return false;
        if (person == null) return false;
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (people[i].getLast().equals(person.getLast())) {
                index = i;
                break;
            }
        }
        if (index == -1) return false;
        Person[] temp = new Person[people.length];
        System.arraycopy(people, 0, temp, 0, index);
        System.arraycopy(people, index + 1, temp, index, people.length - (index + 1));
        people = temp;
        --size;
        return true;
    }


    public Person get(int i) {
        if (i < 0 || i >= size) {
            return null;
        }
        return people[i];
    }

    public void resize() {
        System.out.println("resizing");
        int len = people.length;
        int newLen = 2 * len;
        Person[] newArray = new Person[newLen];
        System.arraycopy(people, 0, newArray, 0, len);
        people = newArray;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(people[i] + "\n");
        }
        return sb.toString();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Object clone() {
        Person[] temp = Arrays.copyOf(people, size);
        return temp;
    }

    public static void main(String[] args) {
        MyEmployeeList l = new MyEmployeeList();
        l.add(new Person("Bob", "Elmar", 65));
        l.add(new Person("Steve", "Waugh", 53));
        l.add(new Person("Susan", "Sack", 25));
        l.add(new Person("Mark", "Waugh", 34));
        l.add(new Person("Joe", "Battler", 28));

        System.out.println("Number of employees: " + l.size);

        l.insert(new Person("Mark", "Wood", 35), 2);


        System.out.println(l);
        l.remove(new Person("Susan", "Sack", 25));
        l.remove(new Person("Mark", "Waugh", 34));
        System.out.println(l);
    }
}
