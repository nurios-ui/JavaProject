package Homework1;

public class Human {
    public int runLength;
    public int jumpHeight;

    public Human(int runLength, int jumpHeight) {
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
    }

    public static void humanRun (int runLength) {
        System.out.println("Human runs for " + runLength + "meters.");
    }

    public static void humanJump (int jumpHeight) {
        System.out.println("Human jumps for" + jumpHeight + "meters.");
    }
}
