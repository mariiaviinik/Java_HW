package hw22.builder;

public class CarDirector {
    private CarBuilder carBuilder;
    public CarDirector(CarBuilder carBuilder){
        this.carBuilder = carBuilder;
    }

    public Car buildCar(){
        carBuilder.buildEngine();
        carBuilder.makeHeadlights();
        carBuilder.makeWheels();
        carBuilder.buildBody();
        return carBuilder.getCar();
    }
}
