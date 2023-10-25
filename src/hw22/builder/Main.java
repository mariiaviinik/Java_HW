package hw22.builder;

public class Main {
    public static void main(String[] args) {
        CarBuilder sportCarBuilder = new SportCarBuilder();
        CarDirector carDirector = new CarDirector(sportCarBuilder);
        Car sportCar = carDirector.buildCar();
        System.out.println(sportCar.getBody());
    }
}
