package design_patterns.builder;

/**
 * Created by CC on 10.12.2017.
 */
public class Wheel {

    private String model;
    private int weight;

    public int getWeight() {
        return weight;
    }

    public Wheel setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Wheel setModel(String model) {
        this.model = model;
        return this;
    }
}
