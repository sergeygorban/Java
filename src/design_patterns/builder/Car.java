package design_patterns.builder;

/**
 * Created by CC on 10.12.2017.
 */
public class Car {

    private String model;
    private Wheel wheel;
    private Body body;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public int getWeight() {
        return wheel.getWeight() + body.getWeight();
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", wheel=" + wheel.getModel() +
                ", body=" + body.getModel() +
                '}';
    }
}
