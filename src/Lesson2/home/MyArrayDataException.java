package lesson2.online;

public class MyArrayDataException extends Exception {
    public int x;
    public int y;

    public MyArrayDataException (int x, int y) {
        this.x = x;
        this.y = y;
    }
}