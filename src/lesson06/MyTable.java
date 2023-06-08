package lesson06;

public class MyTable {
    private Entry[] entries;
    private final int asciiValueOfLowerA = 97;
    private final int MAX_ARRAY_SIZE = 26;

    public MyTable() {
        this.entries = new Entry[MAX_ARRAY_SIZE];
    }

    public String get(char c) {
        for (Entry e : entries) {
            if (e != null && e.ch == c) {
                return e.str;
            }
        }
        return null;
    }

    public void add(char c, String s) {
        int asciiValue = (int) c;
        Entry e = new Entry(c, s);
        entries[asciiValue - asciiValueOfLowerA] = e;
    }

    @Override
    public String toString() {
        String str = "";
        for (Entry e : entries) {
            if (e != null) {
                str += e + "\n";
            }
        }
        return str;
    }

    private class Entry {
        char ch;
        String str;

        public Entry(char ch, String str) {
            this.ch = ch;
            this.str = str;
        }

        @Override
        public String toString() {
            return ch + "->" + str;
        }
    }
}


