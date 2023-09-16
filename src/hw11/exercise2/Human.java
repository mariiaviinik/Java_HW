package hw11.exercise2;

public class Human implements Participant {
    private int jumpLimit;
    private int runLimit;

    public Human(int runLimit, int jumpLimit) {
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override
    public void run() {
        System.out.println("Human is running");
    }

    @Override
    public void jump() {
        System.out.println("Human is jumping");
    }

    @Override
    public int getJumpLimit() {
        return jumpLimit;
    }

    @Override
    public int getRunLimit() {
        return runLimit;
    }
}
