package design_patterns.builder;

/**
 * Created by CC on 10.12.2017.
 */

// Выполняет функцию сборки в нужной последовательности

public class Director {

    public static Car assemblyCar() {
        Builder builder = new MazdaBuilder();
        builder.createCar();
        builder.createWheel();
        builder.createBody();
        return builder.getCar();
    }
}
