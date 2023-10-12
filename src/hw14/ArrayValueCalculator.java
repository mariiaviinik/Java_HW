package hw14;

public class ArrayValueCalculator {
    public int doCalc(String[][] array) throws ArraySizeException, ArrayDataException {
        if (array.length != 4) throw new ArraySizeException("Height of array has to be 4");
        for (String[] layer : array) {
            if (layer.length != 4) throw new ArraySizeException("Width of array has to be 4");
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    System.out.println(Integer.parseInt(array[i][j]));
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException nfe) {
                    throw new ArrayDataException(i, j, sum);
                }
            }
        }

        return sum;
    }
}
