package hw11.exercise2;

public class Wall implements Barrier {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void overcome(Object obj) {
        System.out.println("Participant " + obj.getClass().getSimpleName() + " has just jumped over a wall on a distance. " + this.height + ".");
    }

    @Override
    public void lose(Object obj, int passedPoints) {
        System.out.println("Participant " + obj.getClass().getSimpleName() + " has not jumped over a wall on a distance " + this.height + ". Passed " + passedPoints + ".");
    }

    @Override
    public int getPower() {
        return height;
    }
}
