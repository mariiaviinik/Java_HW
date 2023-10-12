package hw6;

public class Animals {
    private static int animalNumber = 0;
    private String name;

    public Animals(String name) {
        this.name = name;
        animalNumber++;
    }

    public String getName() {
        return this.name;
    }

    public static int getAnimalNumber() {
        return animalNumber;
    }

    public void run(int distance, Integer maxRunDistance) {
        if (maxRunDistance == null) {
            System.out.println(this.name + " can't run!");
            return;
        }
        if (distance <= maxRunDistance) {
            System.out.println(this.name + " run " + distance + " meters.");
        } else {
            System.out.println(this.name + " can't run that much meters!");
        }
    }

    public void swim(int distance, Integer maxSwimDistance) {
        if (maxSwimDistance == null) {
            System.out.println(this.name + " can't swim!");
            return;
        }
        if (distance <= maxSwimDistance) {
            System.out.println(this.name + " swam " + distance + " meters.");
        } else {
            System.out.println(this.name + " can't swim that much meters!");
        }
    }
}
