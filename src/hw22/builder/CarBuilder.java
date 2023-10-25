package hw22.builder;

public interface CarBuilder {
    void buildEngine();
    void makeWheels();
    void makeHeadlights();
    void buildBody();
    Car getCar();
}
