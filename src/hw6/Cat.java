package hw6;

public class Cat extends Animals {
    private static int catNumber = 0;
    private Integer maxRunDistance = 200;
    private Integer maxSwimDistance;

    public Cat(String name) {
        super(name);
        catNumber++;
    }

    public static int getCatNumber() {
        return catNumber;
    }

    public void run(int distance) {
        super.run(distance, this.maxRunDistance);
    }

    public void swim(int distance) {
        super.swim(distance, this.maxSwimDistance);
    }
}
