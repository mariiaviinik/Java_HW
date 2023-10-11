package hw14;

public class ArrayDataException extends Exception {
    private int lastResult = 0;

    public ArrayDataException(int i, int j, int sum) {
        super("Conversion failed in array element [" + i + "][" + j + "]");
        this.lastResult = sum;
    }

    public int getLastResult() {
        return lastResult;
    }
}
