package design_patterns.builder;

/**
 * Created by CC on 10.12.2017.
 */

// ��������� ������� ������ � ������ ������������������

public class Director {

    public static Car assemblyCar() {
        Builder builder = new MazdaBuilder();
        builder.createCar();
        builder.createWheel();
        builder.createBody();
        return builder.getCar();
    }
}
