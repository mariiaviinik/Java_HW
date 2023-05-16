package hw5;

public class Car {
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("Car is ready to drive");
    }

    private void startElectricity() {
        System.out.println("Electricity started");
    }

    private void startCommand() {
        System.out.println("Command started");
    }

    private void startFuelSystem() {
        System.out.println("Fuel system started");
    }
}
