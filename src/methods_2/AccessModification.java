package methods_2;

/*Методы доступа и модификации*/

public class AccessModification {

    private int weight;

    /* Метод доступа или геттер.
    Главная задача - вернуть значение*/

    public int getWeight() {
        return weight;
    }

    /* Метод модификации или сеттер
    Главная задача - установить или изменить значение*/

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static void main(String[] args) {

        AccessModification acc = new AccessModification();
        acc.setWeight(33);
        System.out.println(acc.getWeight());
    }
}
