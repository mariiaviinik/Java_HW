package hw11.exercise2;

public interface Barrier {
    public void overcome(Object obj);

    public void lose(Object obj, int passedPoints);

    int getPower();
}
