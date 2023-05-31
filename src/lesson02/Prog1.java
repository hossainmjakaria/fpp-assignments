package lesson02;

public class Prog1 {
    public static void main(String[] args) {
        int x = RandomNumbers.getRandomInt(1, 9);
        System.out.println("1. get a random number x in the range 1 .. 9 and compute π^x: " + Math.pow(Math.PI, x));

        int y = RandomNumbers.getRandomInt(3, 14);
        System.out.println("2. get a random number y in the range 3 .. 14 and compute y^π: " + Math.pow(y, Math.PI));
    }
}

