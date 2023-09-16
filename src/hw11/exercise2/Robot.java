package hw11.exercise2;

public class Robot implements Participant {
    private int jumpLimit;
    private int runLimit;

    public Robot(int runLimit, int jumpLimit) {
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override
    public void run() {
        System.out.println("Robot is running");
    }

    @Override
    public void jump() {
        System.out.println("Robot is jumping");
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
