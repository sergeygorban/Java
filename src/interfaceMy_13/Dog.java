package interfaceMy_13;

/**
 * Created by CC on 05.06.2017.
 */
public class Dog extends Animal {

    public void love() {
        System.out.println("I love");
    }



    public static void main(String[] args) {

        /* При таком объявлении доступны только
        методы объявленные в интерфейсе Pet */
        Pet dog = new Dog();

        dog.beFriendly();
        dog.play();


        /* Вызов константы */
        System.out.println(ID);

        /*Вызов статического метода интерфейса */
        System.out.println(Pet.createRation("A", "S", "W"));

        /* Вызов метода по умолчанию */
        dog.print();

    }
}
