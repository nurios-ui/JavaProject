package Homework1;

public class Robot {
    public int runLength;
    public int jumpHeight;

    public Robot(int runLength, int jumpHeight) {
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
    }

    public static void robotRun (int runLength) {
        System.out.println("Robot runs for " + runLength + "meters.");
    }

    public static void robotJump (int jumpHeight) {
        System.out.println("Robot jumps for" + jumpHeight + "meters.");
    }
}
