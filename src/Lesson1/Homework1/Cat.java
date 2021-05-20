package Homework1;

public class Cat {
    public int runLength;
    public int jumpHeight;

    public Cat(int runLength, int jumpHeight) {
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
    }

    public static void catRun (int runLength) {
        System.out.println("Cat runs for " + runLength + "meters.");
    }

    public static void catJump (int jumpHeight) {
        System.out.println("Cat jumps for" + jumpHeight + "meters.");
    }
}
