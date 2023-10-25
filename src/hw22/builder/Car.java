package hw22.builder;

public class Car {
    private String wheels;
    private String engine;
    private String headlights;
    private String body;
    public Car(String wheels, String engine, String headlights, String body){
        this.wheels = wheels;
        this.engine= engine;
        this.headlights = headlights;
        this.body = body;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getHeadlights() {
        return headlights;
    }

    public void setHeadlights(String headlights) {
        this.headlights = headlights;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
