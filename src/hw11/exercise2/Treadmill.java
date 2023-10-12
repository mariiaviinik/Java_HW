package hw11.exercise2;

public class Treadmill implements Barrier {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public void overcome(Object obj) {
        System.out.println("Participant " + obj.getClass().getSimpleName() + " has just run a treadmill on a distance " + this.length + ".");
    }

    @Override
    public void lose(Object obj, int passedPoints) {
        System.out.println("Participant " + obj.getClass().getSimpleName() + " has not run a treadmill on a distance " + this.length + ". Passed " + passedPoints + ".");
    }

    @Override
    public int getPower() {
        return length;
    }
}
