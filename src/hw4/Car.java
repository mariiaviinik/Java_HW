package hw4;

public class Car {
    private double tankVolume;
    private double restInTank;
    private double fuelConsumptionPer100Km;

    public Car(double tankVolume, double fuelConsumptionPer100Km) {
        this.tankVolume = tankVolume;
        this.restInTank = tankVolume;
        this.fuelConsumptionPer100Km = fuelConsumptionPer100Km;
    }

    public double getTankVolume() {
        return tankVolume;
    }

    public double getFuelConsumptionPer100Km() {
        return fuelConsumptionPer100Km;
    }

    public double getRestInTank() {
        return restInTank;
    }

    public void setRestInTank(double restInTank) {
        this.restInTank = restInTank;
    }

    public double fillFullTank() {
        double filled = tankVolume - restInTank;
        restInTank = tankVolume;
        return filled;
    }

    public double calculateRestOfFuelAfterNKm(double n) {
        double result = restInTank - fuelConsumptionPer100Km / 100 * n;
        return result;
    }

    public double calculateHowMuchFuelToFillForNKm(double n) {
        double result = restInTank - fuelConsumptionPer100Km / 100 * n;
        return result < 0 ? Math.abs(result) : 0;
    }
}
