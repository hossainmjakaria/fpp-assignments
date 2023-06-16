package lesson11.problem1;

import java.util.HashMap;
import java.util.List;

public class Admin {
    public static HashMap<Key, Student> processStudents(List<Student> students) {
        HashMap<Key, Student> map = new HashMap<>();

        for (Student s : students) {
            Key key = new Key(s.getFirstName(), s.getLastName());
            map.put(key, s);
        }

        return map;
    }

    public static double computeAverageGPA(HashMap<Key, Student> maps) {
        double totalgpa = 0.0;

        for (Student s : maps.values()) {
            totalgpa += s.getGpa();
        }

        return totalgpa / maps.size();
    }
}
