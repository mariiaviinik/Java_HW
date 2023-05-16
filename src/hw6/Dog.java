package hw6;

public class Dog extends Animals {
    private static int dogNumber = 0;
    private Integer maxRunDistance = 500;
    private Integer maxSwimDistance = 10;

    public Dog(String name) {
        super(name);
        dogNumber++;
    }

    public static int getDogNumber() {
        return dogNumber;
    }

    public void run(int distance) {
        super.run(distance, this.maxRunDistance);
    }

    public void swim(int distance) {
        super.swim(distance, this.maxSwimDistance);
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public int getMaxSwimDistance() {
        return maxSwimDistance;
    }
}
