package design_patterns.builder;

/**
 * Created by CC on 10.12.2017.
 */
public class Body {

    private String model;
    private int weight;

    public int getWeight() {
        return weight;
    }

    public Body setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Body setModel(String model) {
        this.model = model;
        return this;
    }
}
