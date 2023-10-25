package hw22.builder;

public class SportCarBuilder implements CarBuilder{
    Car car;

    public SportCarBuilder(){
        this.car = new Car("sport wheels", "sport engine", "sport headlights", "sport body");
    }

    @Override
    public void buildEngine() {
        car.setEngine("sport engine");
    }

    @Override
    public void makeWheels() {
        car.setWheels("sport wheels");
    }

    @Override
    public void makeHeadlights() {
        car.setHeadlights("sport headlights");
    }

    @Override
    public void buildBody() {
        car.setBody("sport body");
    }

    @Override
    public Car getCar() {
        return this.car;
    }
}
