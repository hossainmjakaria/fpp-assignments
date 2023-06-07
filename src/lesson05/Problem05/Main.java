package lesson05.Problem05;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer("IBM", "Intel IV", 256, 2.6);
        Computer computer2 = new Computer("IBM", "Intel IV", 256, 2.6);

        System.out.println("Computer status for 1: " + computer1);
        System.out.println("Computer status for 2: " + computer2);
        System.out.println("Are computers equal?: " + computer1.equals(computer2));

        System.out.println("HashCode for Computer 1: " + computer1.hashCode());
        System.out.println("HashCode for Computer 2: " + computer2.hashCode());
        System.out.println("Are hashCodes equal?: " + (computer1.hashCode() == computer2.hashCode()));
    }
}
