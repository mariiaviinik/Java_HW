package hw14;

public class Main {
    public static void main(String[] args) throws ArraySizeException, ArrayDataException {
        String[][] stringArray = {
                {"1", "12", "34", "8"},
                {"5", "3", "98", "65"},
                {"12", "6", "43", "5"},
                {"5", "4", "1", "5"},
        };

        ArrayValueCalculator arrayValueCalculator = new ArrayValueCalculator();

        try {
            System.out.println("Sum is " + arrayValueCalculator.doCalc(stringArray));
        } catch (ArraySizeException e) {
            System.out.println("Sum can't be counted. " + e.getMessage());
        } catch (ArrayDataException e) {
            System.out.println("Sum can't be counted fully. Last result was: " + e.getLastResult());
        }
    }
}
