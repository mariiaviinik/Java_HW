package hw4;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(60, 8.5);

        int[] distances = {300, 153, 328};
//        double fuelPricePer1Liter = Double.parseDouble(args[0]); //45.69
        double fuelPricePer1Liter = 45.69;
        double filledFuel = car.calculateHowMuchFuelToFillForNKm(781);
        double fuelForWholeTrip = filledFuel + car.getRestInTank();

        System.out.println("Amount of fuel that have to be filled to make a trip: " + filledFuel);
        System.out.println("Price of filled fuel : " + filledFuel * fuelPricePer1Liter);
        System.out.println("The full trip will cost: " + fuelForWholeTrip * fuelPricePer1Liter);

        for (int i = 0; i < distances.length; i++) {
            double rest = car.calculateRestOfFuelAfterNKm(distances[i]);
            car.setRestInTank(rest);
            if (i < distances.length - 1) filledFuel += car.fillFullTank();
        }

        System.out.println("Rest in tank in the end of a trip: " + car.getRestInTank());
    }
}
